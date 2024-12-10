package com.example;

public class User {

    public void seConnecter(String login, String pwd) {
        if (login.equals("maram") && pwd.equals("maram123")) {
            System.out.println("connexion avec succées");
        } else {
            System.out.println("erreur d'authentification");
        }
    }

}
