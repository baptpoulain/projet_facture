package com.example.projetfactures.servlet;

import com.example.projetfactures.dao.DaoInvoice;
import com.example.projetfactures.model.InvoiceEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@WebServlet(urlPatterns = "/client/invoice")
public class InvoiceListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        DaoInvoice dao = new DaoInvoice();
        Optional<List<InvoiceEntity>> invoiceEntity = dao.getInvoiceByIdClient(Integer.parseInt(id));

        if(invoiceEntity.isPresent()){
            req.setAttribute("invoices", invoiceEntity.get());
        }
        else{
            System.out.println("Il n'existe pas de facture pour ce client");
        }
        req.getRequestDispatcher("/WEB-INF/invoice-list.jsp").forward(req, resp);
    }
}
