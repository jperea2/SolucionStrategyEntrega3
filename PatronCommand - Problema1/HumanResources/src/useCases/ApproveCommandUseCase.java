package useCases;

import domain.models.UserModel;
import domain.interfaces.Command;

public class ApproveCommandUseCase implements Command {
    private UserModel user;

    public ApproveCommandUseCase(UserModel user) {
        this.user = user;
    }

    @Override
    public void execute() {
        if ("administrador".equals(user.getRole()) || "gerente".equals(user.getRole())) {
            System.out.println("Acceso permitido: " + user.getName() + " puede aprobar solicitudes.");
        } else {
            System.out.println("Acceso denegado: " + user.getName() + " no tiene permisos para aprobar solicitudes.");
        }
    }
}
