
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Persona;

/**
 *
 * @author user
 */
@WebServlet(name = "SvPersonas", urlPatterns = {"/SvPersonas"})
public class SvPersonas extends HttpServlet {

    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        List<Persona> listaPersonas= control.traerPersonas();
        HttpSession miSession= request.getSession();
        
        miSession.setAttribute("listaPersonas",listaPersonas);
        response.sendRedirect("verPersonas.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String dni=request.getParameter("DNI");
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        String telefono=request.getParameter("telefono");
        //System.out.println("El dni del pibe es: "+ dni);
        Persona pers= new Persona(0,dni,nombre,apellido,telefono);
        control.crearPersona(pers);
        response.sendRedirect("index.jsp");
    }
    

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
