import java.util.Scanner;
public class uri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int cerv, refri, espeto;
		double consumo, ingresso, total;
		cerv = 0;
		refri = 0;
		espeto = 0;
		consumo = 0.0;
		ingresso = 0.0;
		total = 0.0;
		
		char sexo;
		System.out.println("Sexo: ");
		sexo = sc.next().charAt(0);
		System.out.println("Quantidade de cervejas: ");
		cerv = sc.nextInt();
		System.out.println("Quantidade de refrigerantes: ");
		refri = sc.nextInt();
		System.out.println("Quantidade de espetinhos: ");
		espeto = sc.nextInt();
		
		sexo = Character.toLowerCase(sexo);
		if(sexo == 'f') {
			ingresso = 8.00;
		}else{
			ingresso = 10.00;
		}
		
		System.out.println("RELATÓRIO");
		consumo = (cerv * 5.00)+(refri * 3.00)+(espeto * 7.00);
		System.out.printf("Consumo = R$ %.2f%n", consumo);
		if(consumo > 30) {
			System.out.println("Isento de Couvert");	
		}else {
			System.out.println("Couvert = R$ 4.00");
			consumo = consumo + 4.00;
		}
		System.out.printf("Ingresso = R$ %.2f%n", ingresso);
		total = consumo + ingresso;
		System.out.printf("Valor a pagar = R$ %.2f%n", total);
		
		sc.close();
	}
	

}
