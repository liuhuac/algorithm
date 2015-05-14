// CC150
// 2.1 Write code to remove duplicates from an unsorted linked list.
// FOLLOW UP
// How would you solve this problem if a temporary buffer is not allowed?

import java.util.*;

public class Solution2_1{
	public void solve(ArrayList<Integer> list){

		print(list);

		Map<Integer,Integer> m = new HashMap<Integer, Integer>();
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			if(m.containsKey(it.next())){
				it.remove();
			} else {
				m.put(it.next(),1);
			}
		}

		print(list);
	}

	public void print(ArrayList<Integer> list){
		String res = "";
		for(int v : list){
			res = res + String.format("%2d->",v);
		}
		System.out.println(res);
	}

	public static void main(String[] args){

		// define variables here

		// get input data from std input
		/*Scanner in = new Scanner(System.in);
		while(in.hasNextInt){
		
		}*/

		// get input data from file
		/*try{
			BufferedReader br = new BufferedReader(new FileReader(in));
			String line = null;
			while((line = br.readLine())!=null){
				// read line
			}
		} catch(Exception e){
			e.printStackTrace();
		}*/

		// test the algorithm
		ArrayList<Integer> al = new ArrayList<Integer>();
		Random rn = new Random();
		for(int i=0; i<10; i++){
			al.add(rn.nextInt(10));
		}
		Solution2_1 sol = new Solution2_1();
		sol.solve(al);
	}
}