package homeWork.extraHomeWork.task6_40;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        if(book.getTitle().equals(this.titleToSearch)){
            return true;
        }else{
            return false;
        }
    }

}
