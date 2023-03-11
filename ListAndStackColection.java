import java.util.*;

public class ListAndStackColection {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Which one do you want \n1.ArrayList \n2.LinkedList \n3.Stack\n");
        ListAndStackColection.listFunctions(s.nextInt());

    }
    public static List listFunctions(int ch) {
        List returnListObject=null;
        Stack returnStack = null;
        int dschoice = ch;
        boolean b = true;
        switch (dschoice) {
            case 1:
                List<Integer> al = new ArrayList<>();

                while (b) {
                    System.out.println("Which Function You Want to perform \n1.add \n2.add it index \n3.add a new ArrayList " +
                            "\n4.remove \n5.remove at index \n6.Update at Position \n7.Checks Wheather the element is present or not \n8.display");
                    int mechoice = s.nextInt();
                    int ele;
                    int pos;
                    switch (mechoice) {
                        case 1:
                            System.out.println("enter the element you want to add ");
                            ele = s.nextInt();
                            al.add(ele);
                            break;

                        case 2:
                            System.out.println("Enter the element and its position to be set");
                            pos = s.nextInt();
                            ele = s.nextInt();
                            al.add(pos, ele);
                            break;

                        case 3:
                            System.out.println("New Array list is begin added ");
                            List newArrayList=ListAndStackColection.listFunctions(1);
                            al.addAll(newArrayList);
                            break;

                        case 4:
                            System.out.println("Enter the position of the element ");
                            pos = s.nextInt() + 1;
                            al.remove(pos);
                            break;

                        case 5:
                            System.out.println("Enter the element ");
                            ele = s.nextInt();
                            al.remove(Integer.valueOf(ele));
                            break;

                        case 6:
                            System.out.println("enter the element and it's posiotion to update");
                            pos = s.nextInt() - 1;
                            ele = s.nextInt();
                            al.set(pos, ele);
                            break;

                        case 7:
                            System.out.println("Enter the element you want to check");
                            ele = s.nextInt();
                            System.out.println(al.contains(ele));
                            break;

                        case 8:
                            System.out.println(al);
                            break;

                        default:
                            System.out.println("INVALID CHOICE");
                            System.out.println("All the elements in the ArrayList are"+al);

                            returnListObject=al;
                            b = false;
                            break;

                    }
                }
                break;

            case 2:
                LinkedList<Integer> list = new LinkedList<>();
                while (b) {
                    System.out.println("Which Function You Want to perform \1.add \n2.add it index \n3.add a new LinkedList " +
                            "\n4.remove \n5.remove at index \n6.Update at Position \n7.Checks Wheather the element is present or not \n8.display");
                    int mechoice = s.nextInt();
                    int ele;
                    int pos;
                    switch (mechoice) {
                        case 1:
                            System.out.println("enter the element you want to add ");
                            ele = s.nextInt();
                            list.add(ele);
                            break;

                        case 2:
                            System.out.println("Enter the element and its position to be set");
                            pos = s.nextInt();
                            ele = s.nextInt();
                            list.add(pos, ele);
                            break;

                        case 3:
                            System.out.println("New LinkedList is begin added AND ENTER 2");
                            List newArrayList=ListAndStackColection.listFunctions(2);
                            list.addAll(newArrayList);
                            break;

                        case 4:
                            System.out.println("Enter the position of the element ");
                            pos = s.nextInt() + 1;
                            list.remove(pos);
                            break;


                        case 5:
                            System.out.println("Enter the element ");
                            ele = s.nextInt();
                            list.remove(Integer.valueOf(ele));
                            break;


                        case 6:
                            System.out.println("enter the element and it's posiotion to update");
                            pos = s.nextInt() - 1;
                            ele = s.nextInt();
                            list.set(pos, ele);
                            break;


                        case 7:
                            System.out.println("Enter the element you want to check");
                            ele = s.nextInt();
                            System.out.println(list.contains(ele));
                            break;


                        case 8:
                            System.out.println(list);
                            break;

                        default:
                            System.out.println("INVALID CHOICE");
                            System.out.println("All the elements in the LinkedList are"+list);
                            returnListObject=list;
                            b = false;
                            break;

                    }
                }
                break;


            case 3:
                Stack<Integer> stack = new Stack<>();
                while (b) {
                    System.out.println("\1.push\n2.pop\3.peek\4.display");
                    int mechoice = s.nextInt();
                    int ele;
                    switch (mechoice) {
                        case 1:
                            System.out.println("enter the element to push into it ");
                            ele = s.nextInt();
                            stack.push(ele);
                            break;


                        case 2:
                            System.out.println("The poped item is " + stack.pop());
                            break;

                        case 3:
                            System.out.println("The Top most elemet is " + stack.peek());
                            break;

                        case 4:
                            System.out.println(stack);
                            break;

                        default:
                            System.out.println("INVALID CHOICE");
                            returnStack=stack;
                            b = false;
                            break;
                    }
                }
                break;
        }
        if (returnStack==null)
        {
            return returnListObject;
        }
        else
        {
            return returnStack;
        }
    }
}
