package com.example;

import org.junit.jupiter.api.Test;

import com.User;

public class TestEvent {
    @Test
    public void connexion() {
        String loginSaisi = "mara";
        String motDePasseSaisi = "maram123";
        User user = new User();

        if (user.seConnecter(loginSaisi, motDePasseSaisi)) {
            System.out.println("Connexion réussie !");
        } else {
            System.out.println("Échec de la connexion. Login ou mot de passe incorrect.");
        }
    }
}
