package org.stjs.generator.writer.fields;

import org.stjs.javascript.annotation.Template;

public class Fields19 {
	@Template("setter")
	public int field;

	public int method() {
		return field++;
	}

}
