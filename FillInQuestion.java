public class FillInQuestion extends Questions {

        public void setText(String text)
        {
            super.setText(text);
        }
        public void display()
        {
            int s= 0;
            while (s<text.length()) {
                if (text.charAt(s) == '_') break;
                System.out.print(text.charAt(s));
                s++;
            }
            System.out.println("______");
        }
        public String getTextn()
        {
            return text;
        }
    }


