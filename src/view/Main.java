package view;


import fateczl.Lista.model.Lista;
import model.PilhaInt;

public class Main {
	
	public static void main(String[] args) {
		Lista<Integer> l = new Lista<>(); 
		PilhaInt p = new PilhaInt();
		
		try {
			l.addFirst(3);
			l.addLast(5);
			l.addLast(18);
			l.addLast(12);
			l.addLast(7);
			l.addLast(6);
			l.addLast(2);
			l.addLast(13);
			l.addLast(4);
			l.addLast(16);
			
			while (!l.isEmpty()) {
				int val = l.get(0);
				l.removeFirst();
				p.push(val);
			}
			
			int i = 0;
			while (!p.isEmpty()) {
				int val = p.pop();
				l.add(val, i);
				i++;
			}
			
			for (int pos = 0; pos < l.size(); pos++) {
				System.out.print(l.get(pos) + " ");
			}
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
