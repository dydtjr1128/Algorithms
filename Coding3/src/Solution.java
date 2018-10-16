
public class Solution {

	public int solution() {
		String relation[][] = { { "100", "ryan", "music", "2" }, { "200", "apeach", "math", "2" },
				{ "300", "tube", "computer", "3" }, { "400", "con", "computer", "4" }, { "500", "muzi", "music", "3" },
				{ "600", "apeach", "music", "2" } };

		boolean isTupleUnique[] = new boolean[relation[0].length];
		boolean isNotFound = true;
		int answer=0;

		//uniqueness
		for (int j = 0; j < relation[0].length && isNotFound; j++) {
			for (int i = 0; i < relation.length; i++) {
				String temp = relation[i][j];
				for (int q = i + 1; q < relation[i].length; q++) {
					if (temp.equals(relation[i][q])) {
						isNotFound = false;
						break;
					}
				}				
			}
			isTupleUnique[j] = isNotFound;
			if(isNotFound)
				answer++;
			isNotFound = true;			
		}

		for (int i = 0; i < isTupleUnique.length; i++) {
			System.out.print(isTupleUnique[i] + " ");
		}
		
		
		//minimality
		for (int j = 0; j < relation[0].length && isNotFound; j++) {
			for (int i = 0; i < relation.length; i++) {
				String temp = relation[i][j];
				for (int q = i + 1; q < relation[i].length; q++) {
					if (temp.equals(relation[i][q])) {
						isNotFound = false;
						break;
					}
				}				
			}
			isTupleUnique[j] = isNotFound;
			isNotFound = true;			
		}
		
		return 0;
	}

}
