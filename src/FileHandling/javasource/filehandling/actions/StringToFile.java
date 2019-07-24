// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package filehandling.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import filehandling.FileHandling;

/**
 * Stores a string into the provided filedocument
 * 
 * Note that destination will be committed.
 */
public class StringToFile extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String value;
	private IMendixObject __destination;
	private system.proxies.FileDocument destination;

	public StringToFile(IContext context, java.lang.String value, IMendixObject destination)
	{
		super(context);
		this.value = value;
		this.__destination = destination;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.destination = __destination == null ? null : system.proxies.FileDocument.initialize(getContext(), __destination);

		// BEGIN USER CODE
		FileHandling.stringToFile(getContext(), value, destination);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "StringToFile";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
