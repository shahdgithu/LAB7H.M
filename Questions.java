public class Questions {

        protected String text;
        private String answer;

        public Questions()
        {
            text="";
            answer="";
        }

        public void display(){
            System.out.println(text);
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }
        public boolean check_answer(String respons) {
            int s=0,sum_length=0;
            String cap_respons=respons.toUpperCase();
            String cap_answer=answer.toUpperCase();
            while (s<answer.length()&&cap_answer.charAt(s)==cap_respons.charAt(s))
            {
                s++;
                sum_length++;
            }
            if(sum_length==answer.length())  return true;
            else return false;
        }
    }


