package com.servlet.ServletDemo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/dummy")
public class DummyServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In Service");
        res.getWriter().println("Hello World");
    }
}
