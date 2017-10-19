package ch.heigvd.nackeskratta.controllers;

import ch.heigvd.nackeskratta.services.FurnitureManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author brofm_000
 */
public class EditorServlet extends HttpServlet {

    FurnitureManager furnitureManager = new FurnitureManager();

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Furniture furniture = furnitureManager.getRandomFurniture();	
	//request.setAttribute("furniture", furniture);		
	request.getRequestDispatcher("/WEB-INF/edit.jsp").forward(request, response);
    }
}
