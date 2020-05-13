package com.correction.TD.ex1;

//Classe bas�e sur le pattern Singleton qui permet la journalisation de l'application.
public class Journalisation {
	private static Journalisation uniqueInstance;// Stockage de l'unique instance de cette classe.
	private String log;// Chaine de caract�res repr�sentant les messages de log.

	// Constructeur en priv� (donc inaccessible � l'ext�rieur de la classe).
	private Journalisation() {
		log = new String();
	}

	// M�thode statique qui sert de pseudo-constructeur (utilisation du mot clef
	// "synchronized" pour le multithread).
	public static synchronized Journalisation getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Journalisation();
		}
		return uniqueInstance;
	}

	// M�thode qui permet d'ajouter un message de log.
	public void ajouterLog(String log) {

		this.log += log + "\n";
	}

	// M�thode qui retourne tous les messages de log.
	public String afficherLog() {
		return log;
	}
}