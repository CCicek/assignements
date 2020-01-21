package assignements.assignements_06;

public class question_10 {

	public static void main(String[] args) {
		/*Question-10:

Write nested loop to draw this pattern

##
#  #
#   #
#    #
#     #
#      #
#        #

		 */
	for(int i=1;i<8;i++) {
		System.out.print("#");
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		System.out.println("#");
	}
 }

}
