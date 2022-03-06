import java.util.Scanner;

public class PIRAMIDA {
	
	private int n;
	
	public PIRAMIDA(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public void print () {
		for(int j=1; j<=n; j++) {
			for(int k=0; k<(j-1); k++)
				System.out.print(" ");
			for(int k=0; k<2*(n-j+1); k++)
				System.out.print(j);
			System.out.println();
		}
	}


	public static void main(String[] args) {
		PIRAMIDA p = new PIRAMIDA(5);
		p.print();
	}
}
	
