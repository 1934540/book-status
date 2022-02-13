public class FromBorrowedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        String errorMessage = "Перевод книги из статуса `X` в статус `Y` невозможен";
        if (book.getStatus() != Status.BORROWED) {
            System.out.println(errorMessage);
            return;
        }
        if (requestedStatus == Status.ARCHIVED) {
            book.setStatus(Status.ARCHIVED);
        }
        if (requestedStatus == Status.AVAILABLE) {
            book.setStatus(Status.AVAILABLE);
        }
        if (requestedStatus == Status.OVERDUED) {
            book.setStatus(Status.OVERDUED);
        }
    }
}

