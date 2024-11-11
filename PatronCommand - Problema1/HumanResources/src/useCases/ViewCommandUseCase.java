package useCases;

import domain.models.UserModel;
import domain.interfaces.Command;

public class ViewCommandUseCase implements Command {
    private UserModel user;

    public ViewCommandUseCase(UserModel user) {
        this.user = user;
    }

    @Override
    public void execute() {
        if ("administrador".equals(user.getRole()) || "gerente".equals(user.getRole())) {
            System.out.println("Acceso permitido: " + user.getName() + " puede ver la información.");
        } else {
            System.out.println("Acceso denegado: " + user.getName() + " no tiene permisos para ver la información.");
        }
    }
}
