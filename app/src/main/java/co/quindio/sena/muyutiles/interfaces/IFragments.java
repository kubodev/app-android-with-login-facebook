package co.quindio.sena.muyutiles.interfaces;


import co.quindio.sena.muyutiles.fragments.BienvenidaFragment;
import co.quindio.sena.muyutiles.fragments.ConsultaListaUsuarioImagenUrlFragment;
import co.quindio.sena.muyutiles.fragments.ConsultaUsuarioUrlFragment;
import co.quindio.sena.muyutiles.fragments.ConsultarListaUsuariosFragment;
import co.quindio.sena.muyutiles.fragments.ConsultarUsuarioFragment;
import co.quindio.sena.muyutiles.fragments.ConsutarListausuarioImagenFragment;
import co.quindio.sena.muyutiles.fragments.DesarrolladorFragment;
import co.quindio.sena.muyutiles.fragments.RegistrarUsuarioFragment;

/**
 * Created by CHENAO on 5/08/2017.
 */

public interface IFragments extends BienvenidaFragment.OnFragmentInteractionListener,DesarrolladorFragment.OnFragmentInteractionListener,
        RegistrarUsuarioFragment.OnFragmentInteractionListener,ConsultarUsuarioFragment.OnFragmentInteractionListener,
        ConsultarListaUsuariosFragment.OnFragmentInteractionListener,ConsutarListausuarioImagenFragment.OnFragmentInteractionListener,
        ConsultaUsuarioUrlFragment.OnFragmentInteractionListener,ConsultaListaUsuarioImagenUrlFragment.OnFragmentInteractionListener{
}
