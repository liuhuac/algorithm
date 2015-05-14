// CC150
// 2.1 Write code to remove duplicates from an unsorted linked list.
// FOLLOW UP
// How would you solve this problem if a temporary buffer is not allowed?

import java.util.*;

public class Solution2_1{
	public void solve(ArrayList<Integer> list){

		print(list);

		Map m = new HashMap();
		int i = 0;
		for(int v : list){
			if(m.containsKey(v)){
				list.remove(i);
			} else {
				m.put(v,1);
			}
			i++;
		}

		print(list);
	}

	public void print(ArrayList<Integer> list){
		String res = null;
		for(int v : list){
			res = String.format("%2d->",v);
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
		ArrayList al = new ArrayList();
		Random rn = new Random();
		for(int i=0; i<10; i++){
			al.add(rn.nextInt(10));
		}
		Solution2_1 sol = new Solution2_1();
		sol.solve(al);
	}
}