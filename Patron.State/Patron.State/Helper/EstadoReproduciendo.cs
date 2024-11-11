using Patron.State.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Patron.State.Helper
{
    public class EstadoReproduciendo: IEstado
    {
        public void Play(Reproductor reproductor)
        {
            Console.WriteLine("El reproductor ya está reproduciendo.");
        }

        public void Pause(Reproductor reproductor)
        {
            Console.WriteLine("Pausando la reproducción...");
            reproductor.EstadoActual = new EstadoPausado();
        }

        public void Stop(Reproductor reproductor)
        {
            Console.WriteLine("Deteniendo la reproducción...");
            reproductor.EstadoActual = new EstadoParado();
        }
    }
}