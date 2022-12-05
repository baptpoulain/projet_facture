package com.example.projetfactures.servlet;

import com.example.projetfactures.dao.ClientDao;
import com.example.projetfactures.dao.Dao;
import com.example.projetfactures.model.ClientEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@WebServlet(urlPatterns = ClientServlet.URL)
public class ClientServlet extends HttpServlet {

    public static final String URL = "/client";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ClientDao clientDao = new ClientDao();
        List<ClientEntity> clientList =  clientDao.getAll();

        req.setAttribute("clients", clientList);
        req.getRequestDispatcher("/WEB-INF/client-list.jsp").forward(req, resp);
    }
}
