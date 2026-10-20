import java.time.*;
import java.time.LocalDateTime;

public abstract class DocumentRequest {

        private static int nextId = 1;
        private final String requestId;
        private Resident resident;
        private LocalDateTime dateRequested;

        public abstract String getDocumenttype();

        public abstract boolean isEligible();

        public DocumentRequest(Resident resident){
            this.requestId = String.format("REQ-%04d" + nextId);
            this.resindent = resident;
            this.dateRequested = LocalDateTime.now();
        }

        public String getRequestId(){
            return requestId;
        }

        public Resident getResident(){
            return resident;
        }

        public LocalDateTime getDateRequested(){
            return dateRequested;
        }

        public String getResindentName(){
            return resident.getFullName();
        }

        public String getSummary(){
            return "Request ID: " + requestId + "\nResident Name:" + getResindentName();
        }


}
