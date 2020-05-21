public class Department {
        String accounting;
        String finance;
        String HR;
        String InformationTech;
        public Department(){}
        public Department(String accounting, String finance,String informationTech, String HR){
            super();
            this.accounting=accounting;
            this.finance=finance;
            this.InformationTech= informationTech;
            this.HR= HR;
        }
        public String getAccounting(){
            return accounting;
        }

    public void setAccounting(String accounting) {
        this.accounting = accounting;
    }

    public String getFinance() {
        return finance;
    }

    public void setFinance(String finance) {
        this.finance = finance;
    }

    public String getInformationTech() {
        return InformationTech;
    }

    public void setInformationTech(String informationTech) {
        InformationTech = informationTech;
    }

    public String getHR() {
        return HR;
    }

    public void setHR(String HR) {
        this.HR = HR;
    }
    @Override
    public String toString(){
        String informationTech;
        return "Department[accounting=" + accounting+", finance=" +finance+", InformationTech="+InformationTech+",HR="+HR+" ]";

    }
}


