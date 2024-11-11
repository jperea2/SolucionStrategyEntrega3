import domain.interfaces.Command;
import domain.models.UserModel;
import useCases.ApproveCommandUseCase;
import useCases.CommandInvokerUseCase;
import useCases.EditCommandUseCase;
import useCases.ViewCommandUseCase;

public class App {
        public static void main(String[] args) {
            // Crear usuarios con distintos roles
            UserModel empleado = new UserModel("Juan", "empleado");
            UserModel gerente = new UserModel("Maria", "gerente");
            UserModel administrador = new UserModel("Carlos", "administrador");
    
            // Crear comandos para cada acción
            Command viewCommandEmpleado = new ViewCommandUseCase(empleado);
            Command editCommandGerente = new EditCommandUseCase(gerente);
            Command approveCommandAdmin = new ApproveCommandUseCase(administrador);
    
            // Crear invoker
            CommandInvokerUseCase invoker = new CommandInvokerUseCase();
    
            // Ejecutar comandos
            invoker.executeCommand(viewCommandEmpleado); // Acceso denegado
            invoker.executeCommand(editCommandGerente);   // Acceso denegado
            invoker.executeCommand(approveCommandAdmin);  // Acceso permitido
        }

}
