public class LongestCommonSubsequence {
	
	public static void main(String[] args) {
		
		String s1 = "AABCDEFDEDDEDCAACC";
		String s2 = "BAACDFFDCCEEFCDAA";
		
		int[][] arr = new int[s1.length()+1][s2.length()+1];
		char[][] dir = new char[s1.length()+1][s2.length()+1];
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[0].length; j++) {
				if(i == 0 || j == 0) {
					arr[i][j] = 0;
					dir[i][j] = 'n';
				}
				else if(s1.charAt(i-1) == s2.charAt(j-1)) {
					arr[i][j] = 1 + arr[i-1][j-1];
					dir[i][j] = 'd';
				}
				else {
					arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
					if(arr[i][j] == arr[i-1][j]) {
						dir[i][j] = 'u';
					}
					else {
						dir[i][j] = 'l';
					}
				}
			}
		}
		
		System.out.println("The length of the longest common subsequence is: " + arr[s1.length()][s2.length()]);
		
		StringBuilder sb = new StringBuilder();
		int i = s1.length();
		int j = s2.length();
		while(i > 0 && j > 0) {
			if(dir[i][j] == 'd') {
				sb.append(s1.charAt(i-1));
				i--;
				j--;
			}
			else if(dir[i][j] == 'u') {
				i--;
			}
			else {
				j--;
			}
		}
		
		System.out.println("The longest common subsequence is: " + sb.reverse().toString());
	}

}
