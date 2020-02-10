package com.exception;

import java.util.List;

public class ResponseData {
	 private List<UserMessageDTO> successes;
	    private List<UserMessageDTO> errors;
	    private List<UserMessageDTO> warnings;

	    public ResponseData(List<UserMessageDTO> successes, List<UserMessageDTO> errors, List<UserMessageDTO> warnings) {
	        this.successes = successes;
	        this.errors = errors;
	        this.warnings = warnings;
	    }

	    public List<UserMessageDTO> getErrors() {
	        return errors;
	    }

	    public List<UserMessageDTO> getSuccesses() {
	        return successes;
	    }

	    public List<UserMessageDTO> getWarnings() {
	        return warnings;
	    }
}
