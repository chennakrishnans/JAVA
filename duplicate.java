import java.util.Scanner;
class duplicate
{
private static Scanner sc;
public static void main(String[] args)
{
try
{
int Size, i, j, k;
int[] Del_Dup_arr = new int[50];
sc = new Scanner(System.in);
System.out.print("\n Enter the number of elements: ");
Size = sc.nextInt();
for(i = 0; i <Size; i++)
{
System.out.format("\nEnter element %d : ", i);
Del_Dup_arr[i] = sc.nextInt();
}
for(i = 0; i < Size; i++)
{
for(j = i + 1; j < Size; j++)
{
if(Del_Dup_arr[i] == Del_Dup_arr[j]) {
for(k = j; k < Size; k++) {
Del_Dup_arr[k] = Del_Dup_arr[k +
1];
}
Size--;
j--;
}
}
}
System.out.print("\nThe Final Array after Deleting Duplicates = " );
for(i = 0; i < Size; i++)
{
System.out.format("%d ", Del_Dup_arr[i]);
}
}
catch(Exception e)
{
   System.out.println("Invalid due to character exception or Number format exception");
}
}
}