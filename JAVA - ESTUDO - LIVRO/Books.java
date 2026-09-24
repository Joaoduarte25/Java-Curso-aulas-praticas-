class Books{
    String Title;
    String Author;
}

class BooksTestDrive{
    public static void main(String[] args){
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[0].Title = " The Grapes of Java ";
        myBooks[1].Title = " The Java is God ";
        myBooks[2].Title = " The Java is veryHard ";
        myBooks[0].Author = " Sue ";
        myBooks[1].Author = " Bob ";
        myBooks[2].Author = " Ian ";
        while(x < 3){
            System.out.println(myBooks[x].Title);
            System.out.print(" by ");
            System.out.println(myBooks[x].Author);
            x = x + 1;
        }
    }
}