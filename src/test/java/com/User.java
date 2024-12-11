package com;

public class User {
   
        private static final String LOGIN_CORRECT = "mara";
        private static final String MOT_DE_PASSE_CORRECT = "maram123";
    
        public boolean seConnecter(String login, String motDePasse) {
            return LOGIN_CORRECT.equals(login) && MOT_DE_PASSE_CORRECT.equals(motDePasse);
        }      
}
