import java.util.Scanner;

class LoadBalancer {
	// Moin Mohammed Naik
	// 211P030
	static void printLoad(int servers, int Processes) {
		int each = Processes / servers;
		int extra = Processes % servers;
		int total;
		for (int i = 0; i < servers; i++) {
			if (extra-- > 0)
				total = each + 1;
			else
				total = each;
			System.out.println("Server " + (char) ('A' + i) + " has " + total + " Processes.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of servers & processes respectively: ");
		int servers = sc.nextInt();
		int Processes = sc.nextInt();
		while (true) {
			printLoad(servers, Processes);
			System.out.print("\n1.Add Servers 2.Remove Servers 3.Add Processes 4.Remove Processes 5.Exit\nEnter(1-5): ");
			switch (sc.nextInt()) {
				case 1 -> {
					System.out.print("How many more servers?: ");
					servers += sc.nextInt();
				}
				case 2 -> {
					System.out.print("How many servers to remove?: ");
					servers -= sc.nextInt();
				}
				case 3 -> {
					System.out.print("How many more Processes?: ");
					Processes += sc.nextInt();
				}
				case 4 -> {
					System.out.print("How many Processes to remove?: ");
					Processes -= sc.nextInt();
				}
				case 5 -> {
					return;
				}
			}
		}
	}
}
