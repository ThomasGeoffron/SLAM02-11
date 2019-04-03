package fr.gns.app;

public class AppCouleurPion {

	public static void main( String [] args ) {
		
		// Création de la couleur Noire
		
		System.out.println("\nCRÉATION DE LA COULEUR NOIRE\n");
		
		Couleur noir = new Couleur( 1 , "Noir") ;
		
		if(noir.estVide()) {
			System.out.println("1 - La couleur noire n'a pas de pions.\n");
		}
		else {
			System.out.println("1 - La couleur noire a des pions.\n");
		}
		
		// Doit afficher : 1 - La couleur noire n'a pas de pions.
		
		// Création du rat de couleur noire
		
		System.out.println("\nCRÉATION DU RAT DE COULEUR NOIRE\n");
		
		Pion ratNoir = new Pion(2, "Rat", noir);
		
		if(ratNoir.getLaCouleur() == noir) {
			System.out.println("2 - Le rat est de couleur noire.\n");
		}
		else {
			System.out.println("2 - Le rat n'est pas de couleur noire.\n");
		}
		
		// Doit afficher : 2 - Le rat est de couleur noire.
		
		if(noir.estVide()) {
			System.out.println("3 - La couleur noire n'a pas de pions.\n");
		}
		else {
			System.out.println("3 - La couleur noire a des pions.\n");
		}
		
		// Doit afficher : 3 - La couleur noire a des pions.
		
		
		// Création de la couleur blanche
		
		System.out.println("\nCRÉATION DE LA COULEUR BLANCHE\n");
		
		Couleur blanc = new Couleur(2, "Blanc");
		
		if(blanc.estVide()) {
			System.out.println("4 - La couleur blanche n'a pas de pions.\n");
		}
		else {
			System.out.println("4 - La couleur blanche a des pions.\n");
		}
		
		// Doit afficher : 4 - La couleur blanche n'a pas de pions.
		
		// Création de l'éléphant de couleur blanche
		
		System.out.println("\nCRÉATION DE L'ÉLÉPHANT DE COULEUR BLANCHE\n");
		
		Pion elephantBlanc = new Pion(8, "Éléphant", blanc);
		
		if(elephantBlanc.getLaCouleur() == blanc) {
			System.out.println("5 - L'éléphant est de couleur blanche.\n");
		}
		else {
			System.out.println("5 - L'éléphant n'est pas de couleur blanche.\n");
		}
		
		// Doit afficher : 5 - L'éléphant est de couleur blanche.
		
		if(elephantBlanc.getLaCouleur() == noir) {
			System.out.println("6 - L'éléphant est de couleur noire.\n");
		}
		else {
			System.out.println("6 - L'éléphant n'est pas de couleur noire.\n");
		}
		
		// Doit afficher : 6 - L'éléphant n'est pas de couleur noire.
		
		if(blanc.estVide()) {
			System.out.println("7 - La couleur blanche n'a pas de pions.\n");
		}
		else {
			System.out.println("7 - La couleur blanche a des pions.\n");
		}
		
		// Doit afficher : 7 - La couleur blanche a des pions.
		
		// L'éléphant n'est plus de couleur blanche
		
		System.out.println("\nL'ÉLÉPHANT N'EST PLUS DE COULEUR BLANCHE\n");
		
		elephantBlanc.setLaCouleur(noir);
		
		if(elephantBlanc.getLaCouleur() == blanc) {
			System.out.println("8 - L'éléphant est de couleur blanche.\n");
		}
		else {
			System.out.println("8 - L'éléphant n'est plus de couleur blanche.\n");
		}
		
		if(elephantBlanc.getLaCouleur() == noir) {
			System.out.println("9 - L'éléphant est de couleur noire.\n");
		}
		else {
			System.out.println("9 - L'éléphant n'est pas de couleur noire.\n");
		}
		
		// Doit afficher : 9 - L'éléphant est de couleur noire.
		
		if(blanc.estVide()) {
			System.out.println("10 - La couleur blanche n'a pas de pions.\n");
		}
		else {
			System.out.println("10 - La couleur blanche a des pions.\n");
		}
		
		// Doit aficher : 10 - La couleur blanche n'a pas de pions.
	
	}
	
}
