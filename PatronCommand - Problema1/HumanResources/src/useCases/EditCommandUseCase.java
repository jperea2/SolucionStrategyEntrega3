package useCases;

import domain.models.UserModel;
import domain.interfaces.Command;

public class EditCommandUseCase implements Command{
    private UserModel user;

    public EditCommandUseCase(UserModel user) {
        this.user = user;
    }

    @Override
    public void execute() {
        if ("administrador".equals(user.getRole())) {
            System.out.println("Acceso permitido: " + user.getName() + " puede editar los perfiles.");
        } else {
            System.out.println("Acceso denegado: " + user.getName() + " no tiene permisos para editar los perfiles.");
        }
    }
}
