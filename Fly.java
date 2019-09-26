public interface Fly {
	//takeOff sans argument, qui ne retourne rien
	void takeOff();
	//ascend qui prend un entier meters, qui retourne un entier
	int ascend(int meters);
	//descend qui prend un entier meters, qui retourne un entier
	int descend(int meters);
	//land sans argument, qui ne retourne rien
	void land();
	//glide, sans argument, qui ne retourne rien
	//et qui possède un comportement par défaut : afficher le texte ""
	default void glide() {
		System.out.println("It glides into the air.");
	}
}
