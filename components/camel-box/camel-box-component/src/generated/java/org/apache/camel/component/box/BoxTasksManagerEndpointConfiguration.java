
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.box;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.box.api.BoxTasksManager}.
 */
@ApiParams(apiName = "tasks", description = "Box Tasks Manager",
           apiMethods = {@ApiMethod(methodName = "addAssignmentToTask"), @ApiMethod(methodName = "addFileTask"), @ApiMethod(methodName = "deleteTask"), @ApiMethod(methodName = "deleteTaskAssignment"), @ApiMethod(methodName = "getFileTasks"), @ApiMethod(methodName = "getTaskAssignmentInfo"), @ApiMethod(methodName = "getTaskAssignments"), @ApiMethod(methodName = "getTaskInfo"), @ApiMethod(methodName = "updateTaskInfo")})
@UriParams
@Configurer
public final class BoxTasksManagerEndpointConfiguration extends BoxConfiguration {
    @UriParam
    @ApiParam(apiMethods = "addFileTask", description = "The action the task assignee will be prompted to do")
    private com.box.sdk.BoxTask.Action action;
    @UriParam
    @ApiParam(apiMethods = "addAssignmentToTask", description = "The user to assign to task")
    private com.box.sdk.BoxUser assignTo;
    @UriParam
    @ApiParam(apiMethods = "addFileTask", description = "The day at which this task is due")
    private java.util.Date dueAt;
    @UriParam
    @ApiParam(apiMethods = "addFileTask,getFileTasks", description = "The id of file to add task to")
    private String fileId;
    @UriParam
    @ApiParam(apiMethods = "updateTaskInfo", description = "The updated information")
    private com.box.sdk.BoxTask.Info info;
    @UriParam
    @ApiParam(apiMethods = "addFileTask", description = "An optional message to include with the task")
    private String message;
    @UriParam
    @ApiParam(apiMethods = "deleteTaskAssignment,getTaskAssignmentInfo", description = "The id of task assignment to delete")
    private String taskAssignmentId;
    @UriParam
    @ApiParam(apiMethods = "addAssignmentToTask,deleteTask,getTaskAssignments,getTaskInfo,updateTaskInfo", description = "The id of task to add assignment for")
    private String taskId;

    public com.box.sdk.BoxTask.Action getAction() {
        return action;
    }

    public void setAction(com.box.sdk.BoxTask.Action action) {
        this.action = action;
    }

    public com.box.sdk.BoxUser getAssignTo() {
        return assignTo;
    }

    public void setAssignTo(com.box.sdk.BoxUser assignTo) {
        this.assignTo = assignTo;
    }

    public java.util.Date getDueAt() {
        return dueAt;
    }

    public void setDueAt(java.util.Date dueAt) {
        this.dueAt = dueAt;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public com.box.sdk.BoxTask.Info getInfo() {
        return info;
    }

    public void setInfo(com.box.sdk.BoxTask.Info info) {
        this.info = info;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTaskAssignmentId() {
        return taskAssignmentId;
    }

    public void setTaskAssignmentId(String taskAssignmentId) {
        this.taskAssignmentId = taskAssignmentId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}
