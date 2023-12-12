package application;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Affichage {

    public static void main(String[] args) {
        // Création de la fenêtre
        JFrame fenetre = new JFrame("Ma Fenêtre Swing");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(300, 200);

        // Création du bouton
        JButton bouton = new JButton("Cliquez-moi!");

        // Configuration de l'action du bouton
        bouton.addActionListener(event -> System.out.println("Le bouton a été cliqué!"));

        // Ajout du bouton à la fenêtre
        fenetre.getContentPane().add(bouton);

        // Affichage de la fenêtre
        fenetre.setVisible(true);
    }
}
