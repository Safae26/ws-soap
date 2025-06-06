package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.time.LocalDate;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToDirham")
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt * 10.43;
    }
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random()*60000, LocalDate.now());
    }
    @WebMethod
    public List<Compte> listComptes() {
        return List.of(
                new Compte(1, Math.random()*60000, LocalDate.now()),
                new Compte(2, Math.random()*60000, LocalDate.now()),
                new Compte(3, Math.random()*60000, LocalDate.now())
        );
    }
}
