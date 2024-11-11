using Patron.State.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Patron.State.Helper
{
    public class EstadoParado: IEstado
    {
        public void Play(Reproductor reproductor)
        {
            Console.WriteLine("Iniciando la reproducción...");
            reproductor.EstadoActual = new EstadoReproduciendo();
        }

        public void Pause(Reproductor reproductor)
        {
            Console.WriteLine("El reproductor está detenido. No se puede pausar.");
        }

        public void Stop(Reproductor reproductor)
        {
            Console.WriteLine("El reproductor ya está detenido.");
        }
    }
}
