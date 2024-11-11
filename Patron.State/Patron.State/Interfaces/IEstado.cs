using Patron.State.Helper;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Patron.State.Interfaces
{
    public interface IEstado
    {
        void Play(Reproductor reproductor);
        void Pause(Reproductor reproductor);
        void Stop(Reproductor reproductor);
    }
}
