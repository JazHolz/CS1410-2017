package part2;

public class Exercise2 {
	
	// Main method

	public static void main(String[] args) {
		
		// Array of Painters
		
		String[] painters = { "Picasso", "Chagall", "Dali", "Miro" };
		StringBuilder sb = new StringBuilder();
		sb.append("Welcome ");
		
		// For loop in my String Builder 
		
		for(int i=0; i<painters.length; i++){
			if(i==painters.length-1){
				sb.append(" and ");
			}
			sb.append("Mr. "+painters[i]);
			if(i==painters.length-1){
				sb.append(".");
			}else{ 
// this make it so the comma doesn't repeat on the last 'painter'
				sb.append(", ");
			}
		} 
		System.out.println(sb.toString());
	}
}
