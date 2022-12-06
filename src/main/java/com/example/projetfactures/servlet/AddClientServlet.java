package com.example.projetfactures.servlet;

import com.example.projetfactures.dao.ClientDao;
import com.example.projetfactures.model.ClientEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/client/add")
public class AddClientServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/add-client.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        String clientId = request.getParameter("clientId");
        String clientAdress = request.getParameter("clientAdress");
        String clientName = request.getParameter("clientName");
        String clientTel = request.getParameter("clientTel");
        String clientEmail = request.getParameter("clientEmail");
        String clientPostalCode = request.getParameter("clientPostalCode");
        String clientCity = request.getParameter("clientCity");
        String userId = request.getParameter("userId");

        ClientEntity client =
                new ClientEntity(
                Integer.parseInt(clientId),
                clientAdress,
                clientName,
                clientTel,
                clientEmail,
                Integer.parseInt(clientPostalCode),
                clientCity,
                Integer.parseInt(userId)
                );
        ClientDao clientDao = new ClientDao();
        clientDao.save(client);

        resp.sendRedirect(request.getContextPath() + "/client");
    }
}
