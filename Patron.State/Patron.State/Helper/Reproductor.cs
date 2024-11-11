

using Patron.State.Interfaces;

namespace Patron.State.Helper
{
    public class Reproductor
    {
        public IEstado EstadoActual { get; set; }

        public Reproductor()
        {
            EstadoActual = new EstadoParado(); // Estado inicial
        }

        public void Play()
        {
            EstadoActual.Play(this);
        }

        public void Pause()
        {
            EstadoActual.Pause(this);
        }

        public void Stop()
        {
            EstadoActual.Stop(this);
        }
    }
}
