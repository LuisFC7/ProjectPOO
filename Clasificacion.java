
import java.util.Scanner;
public class Clasificacion 
{
	Scanner des = new Scanner(System.in);
	
	System.out.println("What animal do you want to adopt?");
	System.out.println("1. Dog");
	System.out.println("2. Cats");
	int choice = des.nextInt();
	
	switch(choice)
	{
		case 1: perros();
			break;
			
		case 2: gatos();
			break;
			
	}
	
	public void perros()
	{
		System.out.println("---------------------PERROS---------------------");
		System.out.println("Perros:");
		System.out.println("Pastor aleman:");
		System.out.println("Schnauzer");
		System.out.println("Rotweiler");
		System.out.println("San Bernardo");
		System.out.println("Terrier");
		System.out.println("Yorkshire terrier");
		System.out.println("Dachshund");
		System.out.println("Husky siberiano");
		System.out.println("Akita");
		System.out.println("Xoloitzcuintle");
		System.out.println("Sabueso");
		System.out.println("Dalmata");
		System.out.println("Labrador retriever");
		System.out.println("Gran danés");
		
		
	}
	public void gatos()
	{
		System.out.println("---------------------GATOS---------------------");
		System.out.println("Savannah");
		System.out.println("Bosque de Noruega");
		System.out.println("Siberiano");
		System.out.println("Persa");
		System.out.println("Europeo");
		System.out.println("Egipcio");
		System.out.println("Ocicat");
		System.out.println("Toyger");
		System.out.println("Burmés");
		System.out.println("Americano");
		System.out.println("Abisinio");
		System.out.println("Esfinge");
		System.out.println("PeterBald");
	}

}
