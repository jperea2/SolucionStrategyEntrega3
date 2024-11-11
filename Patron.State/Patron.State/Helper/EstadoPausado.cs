

using Patron.State.Interfaces;

namespace Patron.State.Helper
{
    public class EstadoPausado: IEstado
    {
        public void Play(Reproductor reproductor)
        {
            Console.WriteLine("Reanudando la reproducción...");
            reproductor.EstadoActual = new EstadoReproduciendo();
        }

        public void Pause(Reproductor reproductor)
        {
            Console.WriteLine("El reproductor ya está pausado.");
        }

        public void Stop(Reproductor reproductor)
        {
            Console.WriteLine("Deteniendo la reproducción desde pausa...");
            reproductor.EstadoActual = new EstadoParado();
        }
    }
}
