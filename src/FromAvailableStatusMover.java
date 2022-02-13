public class FromAvailableStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        String errorMessage = "Перевод книги из статуса `X` в статус `Y` невозможен";
        if (book.getStatus() != Status.AVAILABLE) {
            System.out.println(errorMessage);
            return;
        }
        if (requestedStatus == Status.ARCHIVED) {
            book.setStatus(Status.ARCHIVED);
        }
        if (requestedStatus == Status.BORROWED) {
            book.setStatus(Status.BORROWED);
        }
        if (requestedStatus == Status.OVERDUED) {
            System.out.println(errorMessage);
        }
    }
}
