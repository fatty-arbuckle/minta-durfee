package com.minta.durfee.minecraft;

import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.plugin.java.JavaPlugin;

import com.minta.durfee.minecraft.commands.Equip;

public class Main extends JavaPlugin {

	public void onEnable() {
		getLogger().info("OOO0OOOOOOkkxxxxxxxxdxdddddododdc.                   .'ldc..:llc::::::::::::::");
		getLogger().info("kkOOOOOO0Okkkxxdxxdddddddddddddo.                      .cdc.'lllcc::::::::::::");
		getLogger().info("kkOOOOOO0Okkkxxddxxdddddddddddd:  .....',;:;,''.       .lo,  :llllcc::;:::::::");
		getLogger().info("kkOOOOOO00Okkkxxxxxxxddolllllc:;ldkOOkdxdlc;:dxx;.     .::'  ;oxxdllc::ll:;;::");
		getLogger().info("kxkkOkOOOOOOOOkOOOOxdoc;;'.... ,oddol;.....:xxlodd;      ,l:';dooxkdllloxo::::");
		getLogger().info("xxxkkkkOO0000OOOOko,.         .'cdocl,.    .ox;:kxxl'..cc;;co:;loooxOxccxOdocc");
		getLogger().info("dxxkkkkkkO00OOOkl'.            ....,c;.    .,.,;,...,..okd;'ol,lodddk0kdodxdlc");
		getLogger().info("dddxxxxkkkkkkkd;.                 .:kO:    ..,;:c;.   ...''.:c,coo''dkdddlllll");
		getLogger().info("odddxxxxdxxdol'.       .          .'dOk'    .;xkd;'.,cl:.....';clo'.cdooolllll");
		getLogger().info("dddodxdddoll,.                      .lxk;    .,kx,'..,;..;clc;..'cccccloolooll");
		getLogger().info("ddoodolc:;'.      ..,,;::;;'.. .. ....',;.   .cOc.,.     ..;ol::..c,;cc:c:lxxd");
		getLogger().info("dddol;'...    .,cl::;,;:cllok0dOKkclo'''..    'xxddo'.    .'l'.,:',,.loccllxd,");
		getLogger().info("xdol:;.;;.   ..,.        .....,xkdOk0oc;. .    .':oc.'.  .... .:,.,;.;occ'..,;");
		getLogger().info("xoc:;,.,.                    .;d;.;l':lkOdc,...   ',...   'l..dc..c;.;cclllccl");
		getLogger().info("c:llc;..  .. .  . ..       ..ok:'';:....';cokd;...'     .;l' .c,';c'.;ccclllcc");
		getLogger().info("lcol:;'...............    .'okO:..'.     .;kO:.,lc.. ..'lo..  .;ccl,';:cccllcc");
		getLogger().info("l'',;;'. . .   .;:c:,;..  .'';:;..      ..okkkdcx00o;..:;..... .,:,..';ccclccc");
		getLogger().info("kddo:..,......cdxxk0OOdcl;''.  ...  ..    . ...  .,llcdd;.. .   ..;o;..'',cccc");
		getLogger().info("d:,..'.........:lddxdl,;'....  .'.      .'',lOxocldkKkc.......  ..'c,,:::llccc");
		getLogger().info("Okxol;........';coxkOOkxolllcloooddoc:;cl;. ......,:ol,'c0o.....,;cc,.,;;c;clc");
		getLogger().info("KKK0kl,.......;;;:cdkOO00Okxo;,;:clo0XXXO;.     ..''.';:ldOxc'..';'..  .codoll");
		getLogger().info("XNXKOk0x......;,,,';lkKXX0d:'.:c.,docxkxc..     .''....';;cco;..;'   .:oxxxxdo");
		getLogger().info("XNKOOxlc.......'kl ..kNWNKd;,ckk:;okxldoc;..     ..;l,...',:OO:....',:llxOkxxd");
		getLogger().info("NNkc'.........',cl,'lNWWNNOocccldO0KKOdl:'.......';:;,'.....lO0l;;:cc;;:kOkxxd");
		getLogger().info("0d,....... ...;lccldKWMWWNNK0kxkO0000kdoxl:;'...'ll:,'',;::;;,dK'',,c''xOOkkxx");
		getLogger().info("kl,........ ..coodxKWMWWWNNNXKK000KKK0Oxloc,..  .ccc:;clc;;;''lO'.... .k0OOOkk");
		getLogger().info("N00d,...  ..  codx0WWWWWNNNXK0000KKK00Ol,,'........':l:;,;:;;::,'.'.'lOOOOkkxx");
		getLogger().info("NXXNXOc'..... :dxx0XNNNNNNNXxxkOOOOO00kc'',........ .::'':codddxxddxOOOOxdoooo");
		getLogger().info("NNXNNNN0;.. ..;oddoldOo::dOOdddxkkO000x,..;,',:';,....',;,;coddk00000Okdoooooo");
		getLogger().info("NXNNNNXNdo'.  .cooooc:cOKKK00OOkxkOO00k:..,c:cck0xol;..;dk0K00OO0000Okxdooolll");
		getLogger().info("NXNNNNXXO00x.  .:ollloodKKXXXXXKOOkO0KKKOxodOKXNNNKk,.'cNWWWXO0O000OOkxdolllcc");
		getLogger().info("XXNNXNNNK0XNKolokdlc:'',,,:coxkdoxkO0KKXXNNNNWWWWNNXc..'XWWWWKOkkOOOkxxdoolccc");
		getLogger().info("XNNNNNNNNNXXKXXXX0oll'.',;ldOXXXXK00KKXXXNNNWWWWNNXNKl:0NWWWWWOdxxxxxdooooollc");
		getLogger().info("NNNNNNNWWWNNNNNNXX0doolclok0KXXXXXXKKXXXXNNWWWNNXXXXNXXXNWWWNNX0kodoolllooooll");
		getLogger().info("NNNNNWWWWWWWWWNXXKK0dooddxkO0KXXXXXXXXXXXNNNNXXXXXXNNNNNXXNNNNWWXxllllllllllcc");
		getLogger().info("NNNNNNNNNWWWNNXX0OkxdodxxxOKKKKXXXXXXXXXXKKKKKXKXXNNXKKKXXNNNWWWWN0occclllc:::");
		getLogger().info("XXXXXXNNNNNNNXXKkdlccccolcloxOO0KKK0kxolcldk0KKXXXOkOKXXNNNNWWWWWWWXkocccc::::");
		getLogger().info("OOkxddxk0KKXXXK0koc:::::::c::::c:,'''''',;coxO0xddx0KXXNNNWNWWWWWWWWWWNXdc:ccc");
		getLogger().info("K00OOO00KXXNNXX0Odlc:::::;;;:cldoc;'.'',,:ldO0KXOxxkKXXXNNNWWWWWWWWWWN0oc:::c:");
		getLogger().info("Minta Durfee, at your service");

		// side-effects: registers all of the event listeners
		new EventRegistration(getServer().getPluginManager(), this);
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("equip")) {
			return Equip.run(sender, label, args);
		}

		return false;
    }

}
