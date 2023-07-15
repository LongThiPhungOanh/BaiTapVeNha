package Week2.Bai1;

import java.util.Objects;

public class Manger {
        Book programmingBook1 = new ProgrammingBook(001,"Tớ Học Lập Trình",
                85000,"Nhiều tác giả","Tiếng Việt","Thư viện Tiếng Việt");
        Book programmingBook2 = new ProgrammingBook(001,"Code Dạo Kí Sự",
                100000,"Phạm Huy Hoàng","Tiếng Việt","Thư viện Tiếng Việt");
        Book programmingBook3 = new ProgrammingBook(001,"Lập Trình Và Cuộc Sống",
                125000,"Jeff Atwood","Tiếng Việt","Thư viện Tiếng Việt");
        Book programmingBook4 = new ProgrammingBook(001,"The Pragmatic Programmer",
                90000,"Andy Hunt, Dave Thomas","Tiếng Anh","Thư viện Tiếng Anh");
        Book programmingBook5 = new ProgrammingBook(001,"But How Do It Know – J",
                98000,"Clark Scott","Tiếng Anh","Thư viện Tiếng Anh");
        Book fictionBook1 = new FictionBook(001, "Người Truyền Ký Ức" , 110000,
                "Jonas ", "Viễn tưởng 1");
        Book fictionBook2 = new FictionBook(001, "Tam Thể" , 90000,
                "Uông Diểu ", "Viễn tưởng 1");
        Book fictionBook3 = new FictionBook(001, "Trạm Tín Hiệu Số 23" , 80000,
                " Hugh Howey ", "Viễn tưởng 2");
        Book fictionBook4 = new FictionBook(001, " Người Về Từ Sao Hỏa" , 95000,
                "Mark Watney", "Viễn tưởng 3");
        Book fictionBook5 = new FictionBook(001, "Cỗ Máy Thời Gian" , 100000,
                "H.G.WELLS", "Viễn tưởng 4");
        Book[] allBook = {programmingBook1,programmingBook2,programmingBook3,programmingBook4,
                programmingBook5,fictionBook1,fictionBook2,fictionBook3,fictionBook4,fictionBook5};
        public void TotalAllMoney(){
            int total = 0;
            for (Book money : allBook) {
                total += money.getPrice();
            }
            System.out.println("Tổng tiền là: " + total);
        }
        public void countCategory (){
            int check = 0;
            for (int i = 5; i < allBook.length; i++) {
              if (allBook[i] instanceof FictionBook){
               FictionBook fictionBook = (FictionBook) allBook[i];
               fictionBook.getCategory();
                  if(((FictionBook) allBook[i]).getCategory().equals("Viễn tưởng 1")){
                      check++;
                  }
              }
            }
            System.out.println("Số sách Fiction có category là .Viễn tưởng 1 là " + check);
        }
        public void totalPrice(){
            int count = 0;
            for (Book book : allBook) {
                if (book.getPrice() < 90000) {
                    count++;
                }
            }
            System.out.println("Số sách có giá < 90000: " + count);
        }
}
