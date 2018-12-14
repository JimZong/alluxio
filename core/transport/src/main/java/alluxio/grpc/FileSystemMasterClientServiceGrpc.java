package alluxio.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 **
 * This interface contains file system master service endpoints for Alluxio clients.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.1)",
    comments = "Source: file_system_master.proto")
public final class FileSystemMasterClientServiceGrpc {

  private FileSystemMasterClientServiceGrpc() {}

  public static final String SERVICE_NAME = "alluxio.grpc.FileSystemMasterClientService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCheckConsistencyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<alluxio.grpc.CheckConsistencyPRequest,
      alluxio.grpc.CheckConsistencyPResponse> METHOD_CHECK_CONSISTENCY = getCheckConsistencyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.CheckConsistencyPRequest,
      alluxio.grpc.CheckConsistencyPResponse> getCheckConsistencyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<alluxio.grpc.CheckConsistencyPRequest,
      alluxio.grpc.CheckConsistencyPResponse> getCheckConsistencyMethod() {
    return getCheckConsistencyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<alluxio.grpc.CheckConsistencyPRequest,
      alluxio.grpc.CheckConsistencyPResponse> getCheckConsistencyMethodHelper() {
    io.grpc.MethodDescriptor<alluxio.grpc.CheckConsistencyPRequest, alluxio.grpc.CheckConsistencyPResponse> getCheckConsistencyMethod;
    if ((getCheckConsistencyMethod = FileSystemMasterClientServiceGrpc.getCheckConsistencyMethod) == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        if ((getCheckConsistencyMethod = FileSystemMasterClientServiceGrpc.getCheckConsistencyMethod) == null) {
          FileSystemMasterClientServiceGrpc.getCheckConsistencyMethod = getCheckConsistencyMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.CheckConsistencyPRequest, alluxio.grpc.CheckConsistencyPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.FileSystemMasterClientService", "CheckConsistency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.CheckConsistencyPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.CheckConsistencyPResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileSystemMasterClientServiceMethodDescriptorSupplier("CheckConsistency"))
                  .build();
          }
        }
     }
     return getCheckConsistencyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCompleteFileMethod()} instead. 
  public static final io.grpc.MethodDescriptor<alluxio.grpc.CompleteFilePRequest,
      alluxio.grpc.CompleteFilePResponse> METHOD_COMPLETE_FILE = getCompleteFileMethodHelper();

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.CompleteFilePRequest,
      alluxio.grpc.CompleteFilePResponse> getCompleteFileMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<alluxio.grpc.CompleteFilePRequest,
      alluxio.grpc.CompleteFilePResponse> getCompleteFileMethod() {
    return getCompleteFileMethodHelper();
  }

  private static io.grpc.MethodDescriptor<alluxio.grpc.CompleteFilePRequest,
      alluxio.grpc.CompleteFilePResponse> getCompleteFileMethodHelper() {
    io.grpc.MethodDescriptor<alluxio.grpc.CompleteFilePRequest, alluxio.grpc.CompleteFilePResponse> getCompleteFileMethod;
    if ((getCompleteFileMethod = FileSystemMasterClientServiceGrpc.getCompleteFileMethod) == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        if ((getCompleteFileMethod = FileSystemMasterClientServiceGrpc.getCompleteFileMethod) == null) {
          FileSystemMasterClientServiceGrpc.getCompleteFileMethod = getCompleteFileMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.CompleteFilePRequest, alluxio.grpc.CompleteFilePResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.FileSystemMasterClientService", "CompleteFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.CompleteFilePRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.CompleteFilePResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileSystemMasterClientServiceMethodDescriptorSupplier("CompleteFile"))
                  .build();
          }
        }
     }
     return getCompleteFileMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateDirectoryMethod()} instead. 
  public static final io.grpc.MethodDescriptor<alluxio.grpc.CreateDirectoryPRequest,
      alluxio.grpc.CreateDirectoryPResponse> METHOD_CREATE_DIRECTORY = getCreateDirectoryMethodHelper();

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.CreateDirectoryPRequest,
      alluxio.grpc.CreateDirectoryPResponse> getCreateDirectoryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<alluxio.grpc.CreateDirectoryPRequest,
      alluxio.grpc.CreateDirectoryPResponse> getCreateDirectoryMethod() {
    return getCreateDirectoryMethodHelper();
  }

  private static io.grpc.MethodDescriptor<alluxio.grpc.CreateDirectoryPRequest,
      alluxio.grpc.CreateDirectoryPResponse> getCreateDirectoryMethodHelper() {
    io.grpc.MethodDescriptor<alluxio.grpc.CreateDirectoryPRequest, alluxio.grpc.CreateDirectoryPResponse> getCreateDirectoryMethod;
    if ((getCreateDirectoryMethod = FileSystemMasterClientServiceGrpc.getCreateDirectoryMethod) == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        if ((getCreateDirectoryMethod = FileSystemMasterClientServiceGrpc.getCreateDirectoryMethod) == null) {
          FileSystemMasterClientServiceGrpc.getCreateDirectoryMethod = getCreateDirectoryMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.CreateDirectoryPRequest, alluxio.grpc.CreateDirectoryPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.FileSystemMasterClientService", "CreateDirectory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.CreateDirectoryPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.CreateDirectoryPResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileSystemMasterClientServiceMethodDescriptorSupplier("CreateDirectory"))
                  .build();
          }
        }
     }
     return getCreateDirectoryMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateFileMethod()} instead. 
  public static final io.grpc.MethodDescriptor<alluxio.grpc.CreateFilePRequest,
      alluxio.grpc.CreateFilePResponse> METHOD_CREATE_FILE = getCreateFileMethodHelper();

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.CreateFilePRequest,
      alluxio.grpc.CreateFilePResponse> getCreateFileMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<alluxio.grpc.CreateFilePRequest,
      alluxio.grpc.CreateFilePResponse> getCreateFileMethod() {
    return getCreateFileMethodHelper();
  }

  private static io.grpc.MethodDescriptor<alluxio.grpc.CreateFilePRequest,
      alluxio.grpc.CreateFilePResponse> getCreateFileMethodHelper() {
    io.grpc.MethodDescriptor<alluxio.grpc.CreateFilePRequest, alluxio.grpc.CreateFilePResponse> getCreateFileMethod;
    if ((getCreateFileMethod = FileSystemMasterClientServiceGrpc.getCreateFileMethod) == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        if ((getCreateFileMethod = FileSystemMasterClientServiceGrpc.getCreateFileMethod) == null) {
          FileSystemMasterClientServiceGrpc.getCreateFileMethod = getCreateFileMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.CreateFilePRequest, alluxio.grpc.CreateFilePResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.FileSystemMasterClientService", "CreateFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.CreateFilePRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.CreateFilePResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileSystemMasterClientServiceMethodDescriptorSupplier("CreateFile"))
                  .build();
          }
        }
     }
     return getCreateFileMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFreeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<alluxio.grpc.FreePRequest,
      alluxio.grpc.FreePResponse> METHOD_FREE = getFreeMethodHelper();

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.FreePRequest,
      alluxio.grpc.FreePResponse> getFreeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<alluxio.grpc.FreePRequest,
      alluxio.grpc.FreePResponse> getFreeMethod() {
    return getFreeMethodHelper();
  }

  private static io.grpc.MethodDescriptor<alluxio.grpc.FreePRequest,
      alluxio.grpc.FreePResponse> getFreeMethodHelper() {
    io.grpc.MethodDescriptor<alluxio.grpc.FreePRequest, alluxio.grpc.FreePResponse> getFreeMethod;
    if ((getFreeMethod = FileSystemMasterClientServiceGrpc.getFreeMethod) == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        if ((getFreeMethod = FileSystemMasterClientServiceGrpc.getFreeMethod) == null) {
          FileSystemMasterClientServiceGrpc.getFreeMethod = getFreeMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.FreePRequest, alluxio.grpc.FreePResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.FileSystemMasterClientService", "Free"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.FreePRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.FreePResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileSystemMasterClientServiceMethodDescriptorSupplier("Free"))
                  .build();
          }
        }
     }
     return getFreeMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetMountTableMethod()} instead. 
  public static final io.grpc.MethodDescriptor<alluxio.grpc.GetMountTablePRequest,
      alluxio.grpc.GetMountTablePResponse> METHOD_GET_MOUNT_TABLE = getGetMountTableMethodHelper();

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.GetMountTablePRequest,
      alluxio.grpc.GetMountTablePResponse> getGetMountTableMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<alluxio.grpc.GetMountTablePRequest,
      alluxio.grpc.GetMountTablePResponse> getGetMountTableMethod() {
    return getGetMountTableMethodHelper();
  }

  private static io.grpc.MethodDescriptor<alluxio.grpc.GetMountTablePRequest,
      alluxio.grpc.GetMountTablePResponse> getGetMountTableMethodHelper() {
    io.grpc.MethodDescriptor<alluxio.grpc.GetMountTablePRequest, alluxio.grpc.GetMountTablePResponse> getGetMountTableMethod;
    if ((getGetMountTableMethod = FileSystemMasterClientServiceGrpc.getGetMountTableMethod) == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        if ((getGetMountTableMethod = FileSystemMasterClientServiceGrpc.getGetMountTableMethod) == null) {
          FileSystemMasterClientServiceGrpc.getGetMountTableMethod = getGetMountTableMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.GetMountTablePRequest, alluxio.grpc.GetMountTablePResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.FileSystemMasterClientService", "GetMountTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.GetMountTablePRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.GetMountTablePResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileSystemMasterClientServiceMethodDescriptorSupplier("GetMountTable"))
                  .build();
          }
        }
     }
     return getGetMountTableMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetNewBlockIdForFileMethod()} instead. 
  public static final io.grpc.MethodDescriptor<alluxio.grpc.GetNewBlockIdForFilePRequest,
      alluxio.grpc.GetNewBlockIdForFilePResponse> METHOD_GET_NEW_BLOCK_ID_FOR_FILE = getGetNewBlockIdForFileMethodHelper();

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.GetNewBlockIdForFilePRequest,
      alluxio.grpc.GetNewBlockIdForFilePResponse> getGetNewBlockIdForFileMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<alluxio.grpc.GetNewBlockIdForFilePRequest,
      alluxio.grpc.GetNewBlockIdForFilePResponse> getGetNewBlockIdForFileMethod() {
    return getGetNewBlockIdForFileMethodHelper();
  }

  private static io.grpc.MethodDescriptor<alluxio.grpc.GetNewBlockIdForFilePRequest,
      alluxio.grpc.GetNewBlockIdForFilePResponse> getGetNewBlockIdForFileMethodHelper() {
    io.grpc.MethodDescriptor<alluxio.grpc.GetNewBlockIdForFilePRequest, alluxio.grpc.GetNewBlockIdForFilePResponse> getGetNewBlockIdForFileMethod;
    if ((getGetNewBlockIdForFileMethod = FileSystemMasterClientServiceGrpc.getGetNewBlockIdForFileMethod) == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        if ((getGetNewBlockIdForFileMethod = FileSystemMasterClientServiceGrpc.getGetNewBlockIdForFileMethod) == null) {
          FileSystemMasterClientServiceGrpc.getGetNewBlockIdForFileMethod = getGetNewBlockIdForFileMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.GetNewBlockIdForFilePRequest, alluxio.grpc.GetNewBlockIdForFilePResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.FileSystemMasterClientService", "GetNewBlockIdForFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.GetNewBlockIdForFilePRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.GetNewBlockIdForFilePResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileSystemMasterClientServiceMethodDescriptorSupplier("GetNewBlockIdForFile"))
                  .build();
          }
        }
     }
     return getGetNewBlockIdForFileMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetStatusMethod()} instead. 
  public static final io.grpc.MethodDescriptor<alluxio.grpc.GetStatusPRequest,
      alluxio.grpc.GetStatusPResponse> METHOD_GET_STATUS = getGetStatusMethodHelper();

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.GetStatusPRequest,
      alluxio.grpc.GetStatusPResponse> getGetStatusMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<alluxio.grpc.GetStatusPRequest,
      alluxio.grpc.GetStatusPResponse> getGetStatusMethod() {
    return getGetStatusMethodHelper();
  }

  private static io.grpc.MethodDescriptor<alluxio.grpc.GetStatusPRequest,
      alluxio.grpc.GetStatusPResponse> getGetStatusMethodHelper() {
    io.grpc.MethodDescriptor<alluxio.grpc.GetStatusPRequest, alluxio.grpc.GetStatusPResponse> getGetStatusMethod;
    if ((getGetStatusMethod = FileSystemMasterClientServiceGrpc.getGetStatusMethod) == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        if ((getGetStatusMethod = FileSystemMasterClientServiceGrpc.getGetStatusMethod) == null) {
          FileSystemMasterClientServiceGrpc.getGetStatusMethod = getGetStatusMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.GetStatusPRequest, alluxio.grpc.GetStatusPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.FileSystemMasterClientService", "GetStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.GetStatusPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.GetStatusPResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileSystemMasterClientServiceMethodDescriptorSupplier("GetStatus"))
                  .build();
          }
        }
     }
     return getGetStatusMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListStatusMethod()} instead. 
  public static final io.grpc.MethodDescriptor<alluxio.grpc.ListStatusPRequest,
      alluxio.grpc.ListStatusPResponse> METHOD_LIST_STATUS = getListStatusMethodHelper();

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.ListStatusPRequest,
      alluxio.grpc.ListStatusPResponse> getListStatusMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<alluxio.grpc.ListStatusPRequest,
      alluxio.grpc.ListStatusPResponse> getListStatusMethod() {
    return getListStatusMethodHelper();
  }

  private static io.grpc.MethodDescriptor<alluxio.grpc.ListStatusPRequest,
      alluxio.grpc.ListStatusPResponse> getListStatusMethodHelper() {
    io.grpc.MethodDescriptor<alluxio.grpc.ListStatusPRequest, alluxio.grpc.ListStatusPResponse> getListStatusMethod;
    if ((getListStatusMethod = FileSystemMasterClientServiceGrpc.getListStatusMethod) == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        if ((getListStatusMethod = FileSystemMasterClientServiceGrpc.getListStatusMethod) == null) {
          FileSystemMasterClientServiceGrpc.getListStatusMethod = getListStatusMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.ListStatusPRequest, alluxio.grpc.ListStatusPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.FileSystemMasterClientService", "ListStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.ListStatusPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.ListStatusPResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileSystemMasterClientServiceMethodDescriptorSupplier("ListStatus"))
                  .build();
          }
        }
     }
     return getListStatusMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMountMethod()} instead. 
  public static final io.grpc.MethodDescriptor<alluxio.grpc.MountPRequest,
      alluxio.grpc.MountPResponse> METHOD_MOUNT = getMountMethodHelper();

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.MountPRequest,
      alluxio.grpc.MountPResponse> getMountMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<alluxio.grpc.MountPRequest,
      alluxio.grpc.MountPResponse> getMountMethod() {
    return getMountMethodHelper();
  }

  private static io.grpc.MethodDescriptor<alluxio.grpc.MountPRequest,
      alluxio.grpc.MountPResponse> getMountMethodHelper() {
    io.grpc.MethodDescriptor<alluxio.grpc.MountPRequest, alluxio.grpc.MountPResponse> getMountMethod;
    if ((getMountMethod = FileSystemMasterClientServiceGrpc.getMountMethod) == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        if ((getMountMethod = FileSystemMasterClientServiceGrpc.getMountMethod) == null) {
          FileSystemMasterClientServiceGrpc.getMountMethod = getMountMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.MountPRequest, alluxio.grpc.MountPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.FileSystemMasterClientService", "Mount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.MountPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.MountPResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileSystemMasterClientServiceMethodDescriptorSupplier("Mount"))
                  .build();
          }
        }
     }
     return getMountMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRemoveMethod()} instead. 
  public static final io.grpc.MethodDescriptor<alluxio.grpc.DeletePRequest,
      alluxio.grpc.DeletePResponse> METHOD_REMOVE = getRemoveMethodHelper();

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.DeletePRequest,
      alluxio.grpc.DeletePResponse> getRemoveMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<alluxio.grpc.DeletePRequest,
      alluxio.grpc.DeletePResponse> getRemoveMethod() {
    return getRemoveMethodHelper();
  }

  private static io.grpc.MethodDescriptor<alluxio.grpc.DeletePRequest,
      alluxio.grpc.DeletePResponse> getRemoveMethodHelper() {
    io.grpc.MethodDescriptor<alluxio.grpc.DeletePRequest, alluxio.grpc.DeletePResponse> getRemoveMethod;
    if ((getRemoveMethod = FileSystemMasterClientServiceGrpc.getRemoveMethod) == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        if ((getRemoveMethod = FileSystemMasterClientServiceGrpc.getRemoveMethod) == null) {
          FileSystemMasterClientServiceGrpc.getRemoveMethod = getRemoveMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.DeletePRequest, alluxio.grpc.DeletePResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.FileSystemMasterClientService", "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.DeletePRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.DeletePResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileSystemMasterClientServiceMethodDescriptorSupplier("Remove"))
                  .build();
          }
        }
     }
     return getRemoveMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRenameMethod()} instead. 
  public static final io.grpc.MethodDescriptor<alluxio.grpc.RenamePRequest,
      alluxio.grpc.RenamePResponse> METHOD_RENAME = getRenameMethodHelper();

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.RenamePRequest,
      alluxio.grpc.RenamePResponse> getRenameMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<alluxio.grpc.RenamePRequest,
      alluxio.grpc.RenamePResponse> getRenameMethod() {
    return getRenameMethodHelper();
  }

  private static io.grpc.MethodDescriptor<alluxio.grpc.RenamePRequest,
      alluxio.grpc.RenamePResponse> getRenameMethodHelper() {
    io.grpc.MethodDescriptor<alluxio.grpc.RenamePRequest, alluxio.grpc.RenamePResponse> getRenameMethod;
    if ((getRenameMethod = FileSystemMasterClientServiceGrpc.getRenameMethod) == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        if ((getRenameMethod = FileSystemMasterClientServiceGrpc.getRenameMethod) == null) {
          FileSystemMasterClientServiceGrpc.getRenameMethod = getRenameMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.RenamePRequest, alluxio.grpc.RenamePResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.FileSystemMasterClientService", "Rename"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.RenamePRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.RenamePResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileSystemMasterClientServiceMethodDescriptorSupplier("Rename"))
                  .build();
          }
        }
     }
     return getRenameMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getScheduleAsyncPersistenceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<alluxio.grpc.ScheduleAsyncPersistencePRequest,
      alluxio.grpc.ScheduleAsyncPersistencePResponse> METHOD_SCHEDULE_ASYNC_PERSISTENCE = getScheduleAsyncPersistenceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.ScheduleAsyncPersistencePRequest,
      alluxio.grpc.ScheduleAsyncPersistencePResponse> getScheduleAsyncPersistenceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<alluxio.grpc.ScheduleAsyncPersistencePRequest,
      alluxio.grpc.ScheduleAsyncPersistencePResponse> getScheduleAsyncPersistenceMethod() {
    return getScheduleAsyncPersistenceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<alluxio.grpc.ScheduleAsyncPersistencePRequest,
      alluxio.grpc.ScheduleAsyncPersistencePResponse> getScheduleAsyncPersistenceMethodHelper() {
    io.grpc.MethodDescriptor<alluxio.grpc.ScheduleAsyncPersistencePRequest, alluxio.grpc.ScheduleAsyncPersistencePResponse> getScheduleAsyncPersistenceMethod;
    if ((getScheduleAsyncPersistenceMethod = FileSystemMasterClientServiceGrpc.getScheduleAsyncPersistenceMethod) == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        if ((getScheduleAsyncPersistenceMethod = FileSystemMasterClientServiceGrpc.getScheduleAsyncPersistenceMethod) == null) {
          FileSystemMasterClientServiceGrpc.getScheduleAsyncPersistenceMethod = getScheduleAsyncPersistenceMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.ScheduleAsyncPersistencePRequest, alluxio.grpc.ScheduleAsyncPersistencePResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.FileSystemMasterClientService", "ScheduleAsyncPersistence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.ScheduleAsyncPersistencePRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.ScheduleAsyncPersistencePResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileSystemMasterClientServiceMethodDescriptorSupplier("ScheduleAsyncPersistence"))
                  .build();
          }
        }
     }
     return getScheduleAsyncPersistenceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSetAclMethod()} instead. 
  public static final io.grpc.MethodDescriptor<alluxio.grpc.SetAclPRequest,
      alluxio.grpc.SetAclPResponse> METHOD_SET_ACL = getSetAclMethodHelper();

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.SetAclPRequest,
      alluxio.grpc.SetAclPResponse> getSetAclMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<alluxio.grpc.SetAclPRequest,
      alluxio.grpc.SetAclPResponse> getSetAclMethod() {
    return getSetAclMethodHelper();
  }

  private static io.grpc.MethodDescriptor<alluxio.grpc.SetAclPRequest,
      alluxio.grpc.SetAclPResponse> getSetAclMethodHelper() {
    io.grpc.MethodDescriptor<alluxio.grpc.SetAclPRequest, alluxio.grpc.SetAclPResponse> getSetAclMethod;
    if ((getSetAclMethod = FileSystemMasterClientServiceGrpc.getSetAclMethod) == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        if ((getSetAclMethod = FileSystemMasterClientServiceGrpc.getSetAclMethod) == null) {
          FileSystemMasterClientServiceGrpc.getSetAclMethod = getSetAclMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.SetAclPRequest, alluxio.grpc.SetAclPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.FileSystemMasterClientService", "SetAcl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.SetAclPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.SetAclPResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileSystemMasterClientServiceMethodDescriptorSupplier("SetAcl"))
                  .build();
          }
        }
     }
     return getSetAclMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSetAttributeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<alluxio.grpc.SetAttributePRequest,
      alluxio.grpc.SetAttributePResponse> METHOD_SET_ATTRIBUTE = getSetAttributeMethodHelper();

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.SetAttributePRequest,
      alluxio.grpc.SetAttributePResponse> getSetAttributeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<alluxio.grpc.SetAttributePRequest,
      alluxio.grpc.SetAttributePResponse> getSetAttributeMethod() {
    return getSetAttributeMethodHelper();
  }

  private static io.grpc.MethodDescriptor<alluxio.grpc.SetAttributePRequest,
      alluxio.grpc.SetAttributePResponse> getSetAttributeMethodHelper() {
    io.grpc.MethodDescriptor<alluxio.grpc.SetAttributePRequest, alluxio.grpc.SetAttributePResponse> getSetAttributeMethod;
    if ((getSetAttributeMethod = FileSystemMasterClientServiceGrpc.getSetAttributeMethod) == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        if ((getSetAttributeMethod = FileSystemMasterClientServiceGrpc.getSetAttributeMethod) == null) {
          FileSystemMasterClientServiceGrpc.getSetAttributeMethod = getSetAttributeMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.SetAttributePRequest, alluxio.grpc.SetAttributePResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.FileSystemMasterClientService", "SetAttribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.SetAttributePRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.SetAttributePResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileSystemMasterClientServiceMethodDescriptorSupplier("SetAttribute"))
                  .build();
          }
        }
     }
     return getSetAttributeMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUnmountMethod()} instead. 
  public static final io.grpc.MethodDescriptor<alluxio.grpc.UnmountPRequest,
      alluxio.grpc.UnmountPResponse> METHOD_UNMOUNT = getUnmountMethodHelper();

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.UnmountPRequest,
      alluxio.grpc.UnmountPResponse> getUnmountMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<alluxio.grpc.UnmountPRequest,
      alluxio.grpc.UnmountPResponse> getUnmountMethod() {
    return getUnmountMethodHelper();
  }

  private static io.grpc.MethodDescriptor<alluxio.grpc.UnmountPRequest,
      alluxio.grpc.UnmountPResponse> getUnmountMethodHelper() {
    io.grpc.MethodDescriptor<alluxio.grpc.UnmountPRequest, alluxio.grpc.UnmountPResponse> getUnmountMethod;
    if ((getUnmountMethod = FileSystemMasterClientServiceGrpc.getUnmountMethod) == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        if ((getUnmountMethod = FileSystemMasterClientServiceGrpc.getUnmountMethod) == null) {
          FileSystemMasterClientServiceGrpc.getUnmountMethod = getUnmountMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.UnmountPRequest, alluxio.grpc.UnmountPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.FileSystemMasterClientService", "Unmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.UnmountPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.UnmountPResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileSystemMasterClientServiceMethodDescriptorSupplier("Unmount"))
                  .build();
          }
        }
     }
     return getUnmountMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateUfsModeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<alluxio.grpc.UpdateUfsModePRequest,
      alluxio.grpc.UpdateUfsModePResponse> METHOD_UPDATE_UFS_MODE = getUpdateUfsModeMethodHelper();

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.UpdateUfsModePRequest,
      alluxio.grpc.UpdateUfsModePResponse> getUpdateUfsModeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<alluxio.grpc.UpdateUfsModePRequest,
      alluxio.grpc.UpdateUfsModePResponse> getUpdateUfsModeMethod() {
    return getUpdateUfsModeMethodHelper();
  }

  private static io.grpc.MethodDescriptor<alluxio.grpc.UpdateUfsModePRequest,
      alluxio.grpc.UpdateUfsModePResponse> getUpdateUfsModeMethodHelper() {
    io.grpc.MethodDescriptor<alluxio.grpc.UpdateUfsModePRequest, alluxio.grpc.UpdateUfsModePResponse> getUpdateUfsModeMethod;
    if ((getUpdateUfsModeMethod = FileSystemMasterClientServiceGrpc.getUpdateUfsModeMethod) == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        if ((getUpdateUfsModeMethod = FileSystemMasterClientServiceGrpc.getUpdateUfsModeMethod) == null) {
          FileSystemMasterClientServiceGrpc.getUpdateUfsModeMethod = getUpdateUfsModeMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.UpdateUfsModePRequest, alluxio.grpc.UpdateUfsModePResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.FileSystemMasterClientService", "UpdateUfsMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.UpdateUfsModePRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.UpdateUfsModePResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileSystemMasterClientServiceMethodDescriptorSupplier("UpdateUfsMode"))
                  .build();
          }
        }
     }
     return getUpdateUfsModeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileSystemMasterClientServiceStub newStub(io.grpc.Channel channel) {
    return new FileSystemMasterClientServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileSystemMasterClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FileSystemMasterClientServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileSystemMasterClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FileSystemMasterClientServiceFutureStub(channel);
  }

  /**
   * <pre>
   **
   * This interface contains file system master service endpoints for Alluxio clients.
   * </pre>
   */
  public static abstract class FileSystemMasterClientServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     **
     * Checks the consistency of the files and directores with the path as the root of the subtree
     * </pre>
     */
    public void checkConsistency(alluxio.grpc.CheckConsistencyPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.CheckConsistencyPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckConsistencyMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     * Marks a file as completed.
     * </pre>
     */
    public void completeFile(alluxio.grpc.CompleteFilePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.CompleteFilePResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCompleteFileMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     * Creates a directory.
     * </pre>
     */
    public void createDirectory(alluxio.grpc.CreateDirectoryPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.CreateDirectoryPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateDirectoryMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     * Creates a file.
     * </pre>
     */
    public void createFile(alluxio.grpc.CreateFilePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.CreateFilePResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateFileMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     * Frees the given file or directory from Alluxio.
     * </pre>
     */
    public void free(alluxio.grpc.FreePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.FreePResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFreeMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     * Returns a map from each Alluxio path to information of corresponding mount point
     * </pre>
     */
    public void getMountTable(alluxio.grpc.GetMountTablePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.GetMountTablePResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMountTableMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     * Generates a new block id for the given file.
     * </pre>
     */
    public void getNewBlockIdForFile(alluxio.grpc.GetNewBlockIdForFilePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.GetNewBlockIdForFilePResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNewBlockIdForFileMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     * Returns the status of the file or directory.
     * </pre>
     */
    public void getStatus(alluxio.grpc.GetStatusPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.GetStatusPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     * If the path points to a file, the method returns a singleton with its file information.
     * If the path points to a directory, the method returns a list with file information for the
     * directory contents.
     * </pre>
     */
    public void listStatus(alluxio.grpc.ListStatusPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.ListStatusPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListStatusMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     * Creates a new "mount point", mounts the given UFS path in the Alluxio namespace at the given
     * path. The path should not exist and should not be nested under any existing mount point.
     * </pre>
     */
    public void mount(alluxio.grpc.MountPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.MountPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMountMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     * Deletes a file or a directory and returns whether the remove operation succeeded.
     * NOTUnfortunately, the method cannot be called "delete" as that is a reserved Thrift keyword.
     * </pre>
     */
    public void remove(alluxio.grpc.DeletePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.DeletePResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     * Renames a file or a directory.
     * </pre>
     */
    public void rename(alluxio.grpc.RenamePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.RenamePResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRenameMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     * Schedules async persistence.
     * </pre>
     */
    public void scheduleAsyncPersistence(alluxio.grpc.ScheduleAsyncPersistencePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.ScheduleAsyncPersistencePResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getScheduleAsyncPersistenceMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     * Sets ACL for the path.
     * </pre>
     */
    public void setAcl(alluxio.grpc.SetAclPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.SetAclPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAclMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     * Sets file or directory attributes.
     * </pre>
     */
    public void setAttribute(alluxio.grpc.SetAttributePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.SetAttributePResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAttributeMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     * Deletes an existing "mount point", voiding the Alluxio namespace at the given path. The path
     * should correspond to an existing mount point. Any files in its subtree that are backed by UFS
     * will be persisted before they are removed from the Alluxio namespace.
     * </pre>
     */
    public void unmount(alluxio.grpc.UnmountPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.UnmountPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnmountMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     * Updates the ufs mode for a ufs path under one or more mount points.
     * </pre>
     */
    public void updateUfsMode(alluxio.grpc.UpdateUfsModePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.UpdateUfsModePResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUfsModeMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckConsistencyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.CheckConsistencyPRequest,
                alluxio.grpc.CheckConsistencyPResponse>(
                  this, METHODID_CHECK_CONSISTENCY)))
          .addMethod(
            getCompleteFileMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.CompleteFilePRequest,
                alluxio.grpc.CompleteFilePResponse>(
                  this, METHODID_COMPLETE_FILE)))
          .addMethod(
            getCreateDirectoryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.CreateDirectoryPRequest,
                alluxio.grpc.CreateDirectoryPResponse>(
                  this, METHODID_CREATE_DIRECTORY)))
          .addMethod(
            getCreateFileMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.CreateFilePRequest,
                alluxio.grpc.CreateFilePResponse>(
                  this, METHODID_CREATE_FILE)))
          .addMethod(
            getFreeMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.FreePRequest,
                alluxio.grpc.FreePResponse>(
                  this, METHODID_FREE)))
          .addMethod(
            getGetMountTableMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.GetMountTablePRequest,
                alluxio.grpc.GetMountTablePResponse>(
                  this, METHODID_GET_MOUNT_TABLE)))
          .addMethod(
            getGetNewBlockIdForFileMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.GetNewBlockIdForFilePRequest,
                alluxio.grpc.GetNewBlockIdForFilePResponse>(
                  this, METHODID_GET_NEW_BLOCK_ID_FOR_FILE)))
          .addMethod(
            getGetStatusMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.GetStatusPRequest,
                alluxio.grpc.GetStatusPResponse>(
                  this, METHODID_GET_STATUS)))
          .addMethod(
            getListStatusMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.ListStatusPRequest,
                alluxio.grpc.ListStatusPResponse>(
                  this, METHODID_LIST_STATUS)))
          .addMethod(
            getMountMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.MountPRequest,
                alluxio.grpc.MountPResponse>(
                  this, METHODID_MOUNT)))
          .addMethod(
            getRemoveMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.DeletePRequest,
                alluxio.grpc.DeletePResponse>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getRenameMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.RenamePRequest,
                alluxio.grpc.RenamePResponse>(
                  this, METHODID_RENAME)))
          .addMethod(
            getScheduleAsyncPersistenceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.ScheduleAsyncPersistencePRequest,
                alluxio.grpc.ScheduleAsyncPersistencePResponse>(
                  this, METHODID_SCHEDULE_ASYNC_PERSISTENCE)))
          .addMethod(
            getSetAclMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.SetAclPRequest,
                alluxio.grpc.SetAclPResponse>(
                  this, METHODID_SET_ACL)))
          .addMethod(
            getSetAttributeMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.SetAttributePRequest,
                alluxio.grpc.SetAttributePResponse>(
                  this, METHODID_SET_ATTRIBUTE)))
          .addMethod(
            getUnmountMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.UnmountPRequest,
                alluxio.grpc.UnmountPResponse>(
                  this, METHODID_UNMOUNT)))
          .addMethod(
            getUpdateUfsModeMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.UpdateUfsModePRequest,
                alluxio.grpc.UpdateUfsModePResponse>(
                  this, METHODID_UPDATE_UFS_MODE)))
          .build();
    }
  }

  /**
   * <pre>
   **
   * This interface contains file system master service endpoints for Alluxio clients.
   * </pre>
   */
  public static final class FileSystemMasterClientServiceStub extends io.grpc.stub.AbstractStub<FileSystemMasterClientServiceStub> {
    private FileSystemMasterClientServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileSystemMasterClientServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileSystemMasterClientServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileSystemMasterClientServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Checks the consistency of the files and directores with the path as the root of the subtree
     * </pre>
     */
    public void checkConsistency(alluxio.grpc.CheckConsistencyPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.CheckConsistencyPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckConsistencyMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Marks a file as completed.
     * </pre>
     */
    public void completeFile(alluxio.grpc.CompleteFilePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.CompleteFilePResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCompleteFileMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Creates a directory.
     * </pre>
     */
    public void createDirectory(alluxio.grpc.CreateDirectoryPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.CreateDirectoryPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateDirectoryMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Creates a file.
     * </pre>
     */
    public void createFile(alluxio.grpc.CreateFilePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.CreateFilePResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateFileMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Frees the given file or directory from Alluxio.
     * </pre>
     */
    public void free(alluxio.grpc.FreePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.FreePResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFreeMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Returns a map from each Alluxio path to information of corresponding mount point
     * </pre>
     */
    public void getMountTable(alluxio.grpc.GetMountTablePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.GetMountTablePResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMountTableMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Generates a new block id for the given file.
     * </pre>
     */
    public void getNewBlockIdForFile(alluxio.grpc.GetNewBlockIdForFilePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.GetNewBlockIdForFilePResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNewBlockIdForFileMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Returns the status of the file or directory.
     * </pre>
     */
    public void getStatus(alluxio.grpc.GetStatusPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.GetStatusPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatusMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * If the path points to a file, the method returns a singleton with its file information.
     * If the path points to a directory, the method returns a list with file information for the
     * directory contents.
     * </pre>
     */
    public void listStatus(alluxio.grpc.ListStatusPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.ListStatusPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListStatusMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Creates a new "mount point", mounts the given UFS path in the Alluxio namespace at the given
     * path. The path should not exist and should not be nested under any existing mount point.
     * </pre>
     */
    public void mount(alluxio.grpc.MountPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.MountPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMountMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Deletes a file or a directory and returns whether the remove operation succeeded.
     * NOTUnfortunately, the method cannot be called "delete" as that is a reserved Thrift keyword.
     * </pre>
     */
    public void remove(alluxio.grpc.DeletePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.DeletePResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Renames a file or a directory.
     * </pre>
     */
    public void rename(alluxio.grpc.RenamePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.RenamePResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRenameMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Schedules async persistence.
     * </pre>
     */
    public void scheduleAsyncPersistence(alluxio.grpc.ScheduleAsyncPersistencePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.ScheduleAsyncPersistencePResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScheduleAsyncPersistenceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Sets ACL for the path.
     * </pre>
     */
    public void setAcl(alluxio.grpc.SetAclPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.SetAclPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAclMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Sets file or directory attributes.
     * </pre>
     */
    public void setAttribute(alluxio.grpc.SetAttributePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.SetAttributePResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAttributeMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Deletes an existing "mount point", voiding the Alluxio namespace at the given path. The path
     * should correspond to an existing mount point. Any files in its subtree that are backed by UFS
     * will be persisted before they are removed from the Alluxio namespace.
     * </pre>
     */
    public void unmount(alluxio.grpc.UnmountPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.UnmountPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnmountMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Updates the ufs mode for a ufs path under one or more mount points.
     * </pre>
     */
    public void updateUfsMode(alluxio.grpc.UpdateUfsModePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.UpdateUfsModePResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUfsModeMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   **
   * This interface contains file system master service endpoints for Alluxio clients.
   * </pre>
   */
  public static final class FileSystemMasterClientServiceBlockingStub extends io.grpc.stub.AbstractStub<FileSystemMasterClientServiceBlockingStub> {
    private FileSystemMasterClientServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileSystemMasterClientServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileSystemMasterClientServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileSystemMasterClientServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Checks the consistency of the files and directores with the path as the root of the subtree
     * </pre>
     */
    public alluxio.grpc.CheckConsistencyPResponse checkConsistency(alluxio.grpc.CheckConsistencyPRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckConsistencyMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Marks a file as completed.
     * </pre>
     */
    public alluxio.grpc.CompleteFilePResponse completeFile(alluxio.grpc.CompleteFilePRequest request) {
      return blockingUnaryCall(
          getChannel(), getCompleteFileMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Creates a directory.
     * </pre>
     */
    public alluxio.grpc.CreateDirectoryPResponse createDirectory(alluxio.grpc.CreateDirectoryPRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateDirectoryMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Creates a file.
     * </pre>
     */
    public alluxio.grpc.CreateFilePResponse createFile(alluxio.grpc.CreateFilePRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateFileMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Frees the given file or directory from Alluxio.
     * </pre>
     */
    public alluxio.grpc.FreePResponse free(alluxio.grpc.FreePRequest request) {
      return blockingUnaryCall(
          getChannel(), getFreeMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Returns a map from each Alluxio path to information of corresponding mount point
     * </pre>
     */
    public alluxio.grpc.GetMountTablePResponse getMountTable(alluxio.grpc.GetMountTablePRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMountTableMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Generates a new block id for the given file.
     * </pre>
     */
    public alluxio.grpc.GetNewBlockIdForFilePResponse getNewBlockIdForFile(alluxio.grpc.GetNewBlockIdForFilePRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNewBlockIdForFileMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Returns the status of the file or directory.
     * </pre>
     */
    public alluxio.grpc.GetStatusPResponse getStatus(alluxio.grpc.GetStatusPRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStatusMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * If the path points to a file, the method returns a singleton with its file information.
     * If the path points to a directory, the method returns a list with file information for the
     * directory contents.
     * </pre>
     */
    public alluxio.grpc.ListStatusPResponse listStatus(alluxio.grpc.ListStatusPRequest request) {
      return blockingUnaryCall(
          getChannel(), getListStatusMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Creates a new "mount point", mounts the given UFS path in the Alluxio namespace at the given
     * path. The path should not exist and should not be nested under any existing mount point.
     * </pre>
     */
    public alluxio.grpc.MountPResponse mount(alluxio.grpc.MountPRequest request) {
      return blockingUnaryCall(
          getChannel(), getMountMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Deletes a file or a directory and returns whether the remove operation succeeded.
     * NOTUnfortunately, the method cannot be called "delete" as that is a reserved Thrift keyword.
     * </pre>
     */
    public alluxio.grpc.DeletePResponse remove(alluxio.grpc.DeletePRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Renames a file or a directory.
     * </pre>
     */
    public alluxio.grpc.RenamePResponse rename(alluxio.grpc.RenamePRequest request) {
      return blockingUnaryCall(
          getChannel(), getRenameMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Schedules async persistence.
     * </pre>
     */
    public alluxio.grpc.ScheduleAsyncPersistencePResponse scheduleAsyncPersistence(alluxio.grpc.ScheduleAsyncPersistencePRequest request) {
      return blockingUnaryCall(
          getChannel(), getScheduleAsyncPersistenceMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Sets ACL for the path.
     * </pre>
     */
    public alluxio.grpc.SetAclPResponse setAcl(alluxio.grpc.SetAclPRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAclMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Sets file or directory attributes.
     * </pre>
     */
    public alluxio.grpc.SetAttributePResponse setAttribute(alluxio.grpc.SetAttributePRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAttributeMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Deletes an existing "mount point", voiding the Alluxio namespace at the given path. The path
     * should correspond to an existing mount point. Any files in its subtree that are backed by UFS
     * will be persisted before they are removed from the Alluxio namespace.
     * </pre>
     */
    public alluxio.grpc.UnmountPResponse unmount(alluxio.grpc.UnmountPRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnmountMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Updates the ufs mode for a ufs path under one or more mount points.
     * </pre>
     */
    public alluxio.grpc.UpdateUfsModePResponse updateUfsMode(alluxio.grpc.UpdateUfsModePRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUfsModeMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   **
   * This interface contains file system master service endpoints for Alluxio clients.
   * </pre>
   */
  public static final class FileSystemMasterClientServiceFutureStub extends io.grpc.stub.AbstractStub<FileSystemMasterClientServiceFutureStub> {
    private FileSystemMasterClientServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileSystemMasterClientServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileSystemMasterClientServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileSystemMasterClientServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Checks the consistency of the files and directores with the path as the root of the subtree
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.CheckConsistencyPResponse> checkConsistency(
        alluxio.grpc.CheckConsistencyPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckConsistencyMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Marks a file as completed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.CompleteFilePResponse> completeFile(
        alluxio.grpc.CompleteFilePRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCompleteFileMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Creates a directory.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.CreateDirectoryPResponse> createDirectory(
        alluxio.grpc.CreateDirectoryPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateDirectoryMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Creates a file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.CreateFilePResponse> createFile(
        alluxio.grpc.CreateFilePRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateFileMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Frees the given file or directory from Alluxio.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.FreePResponse> free(
        alluxio.grpc.FreePRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFreeMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Returns a map from each Alluxio path to information of corresponding mount point
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.GetMountTablePResponse> getMountTable(
        alluxio.grpc.GetMountTablePRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMountTableMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Generates a new block id for the given file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.GetNewBlockIdForFilePResponse> getNewBlockIdForFile(
        alluxio.grpc.GetNewBlockIdForFilePRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNewBlockIdForFileMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Returns the status of the file or directory.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.GetStatusPResponse> getStatus(
        alluxio.grpc.GetStatusPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatusMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * If the path points to a file, the method returns a singleton with its file information.
     * If the path points to a directory, the method returns a list with file information for the
     * directory contents.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.ListStatusPResponse> listStatus(
        alluxio.grpc.ListStatusPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListStatusMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Creates a new "mount point", mounts the given UFS path in the Alluxio namespace at the given
     * path. The path should not exist and should not be nested under any existing mount point.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.MountPResponse> mount(
        alluxio.grpc.MountPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMountMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Deletes a file or a directory and returns whether the remove operation succeeded.
     * NOTUnfortunately, the method cannot be called "delete" as that is a reserved Thrift keyword.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.DeletePResponse> remove(
        alluxio.grpc.DeletePRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Renames a file or a directory.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.RenamePResponse> rename(
        alluxio.grpc.RenamePRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRenameMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Schedules async persistence.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.ScheduleAsyncPersistencePResponse> scheduleAsyncPersistence(
        alluxio.grpc.ScheduleAsyncPersistencePRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getScheduleAsyncPersistenceMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Sets ACL for the path.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.SetAclPResponse> setAcl(
        alluxio.grpc.SetAclPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAclMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Sets file or directory attributes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.SetAttributePResponse> setAttribute(
        alluxio.grpc.SetAttributePRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAttributeMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Deletes an existing "mount point", voiding the Alluxio namespace at the given path. The path
     * should correspond to an existing mount point. Any files in its subtree that are backed by UFS
     * will be persisted before they are removed from the Alluxio namespace.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.UnmountPResponse> unmount(
        alluxio.grpc.UnmountPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnmountMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Updates the ufs mode for a ufs path under one or more mount points.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.UpdateUfsModePResponse> updateUfsMode(
        alluxio.grpc.UpdateUfsModePRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUfsModeMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_CONSISTENCY = 0;
  private static final int METHODID_COMPLETE_FILE = 1;
  private static final int METHODID_CREATE_DIRECTORY = 2;
  private static final int METHODID_CREATE_FILE = 3;
  private static final int METHODID_FREE = 4;
  private static final int METHODID_GET_MOUNT_TABLE = 5;
  private static final int METHODID_GET_NEW_BLOCK_ID_FOR_FILE = 6;
  private static final int METHODID_GET_STATUS = 7;
  private static final int METHODID_LIST_STATUS = 8;
  private static final int METHODID_MOUNT = 9;
  private static final int METHODID_REMOVE = 10;
  private static final int METHODID_RENAME = 11;
  private static final int METHODID_SCHEDULE_ASYNC_PERSISTENCE = 12;
  private static final int METHODID_SET_ACL = 13;
  private static final int METHODID_SET_ATTRIBUTE = 14;
  private static final int METHODID_UNMOUNT = 15;
  private static final int METHODID_UPDATE_UFS_MODE = 16;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FileSystemMasterClientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FileSystemMasterClientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_CONSISTENCY:
          serviceImpl.checkConsistency((alluxio.grpc.CheckConsistencyPRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.CheckConsistencyPResponse>) responseObserver);
          break;
        case METHODID_COMPLETE_FILE:
          serviceImpl.completeFile((alluxio.grpc.CompleteFilePRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.CompleteFilePResponse>) responseObserver);
          break;
        case METHODID_CREATE_DIRECTORY:
          serviceImpl.createDirectory((alluxio.grpc.CreateDirectoryPRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.CreateDirectoryPResponse>) responseObserver);
          break;
        case METHODID_CREATE_FILE:
          serviceImpl.createFile((alluxio.grpc.CreateFilePRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.CreateFilePResponse>) responseObserver);
          break;
        case METHODID_FREE:
          serviceImpl.free((alluxio.grpc.FreePRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.FreePResponse>) responseObserver);
          break;
        case METHODID_GET_MOUNT_TABLE:
          serviceImpl.getMountTable((alluxio.grpc.GetMountTablePRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.GetMountTablePResponse>) responseObserver);
          break;
        case METHODID_GET_NEW_BLOCK_ID_FOR_FILE:
          serviceImpl.getNewBlockIdForFile((alluxio.grpc.GetNewBlockIdForFilePRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.GetNewBlockIdForFilePResponse>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((alluxio.grpc.GetStatusPRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.GetStatusPResponse>) responseObserver);
          break;
        case METHODID_LIST_STATUS:
          serviceImpl.listStatus((alluxio.grpc.ListStatusPRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.ListStatusPResponse>) responseObserver);
          break;
        case METHODID_MOUNT:
          serviceImpl.mount((alluxio.grpc.MountPRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.MountPResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((alluxio.grpc.DeletePRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.DeletePResponse>) responseObserver);
          break;
        case METHODID_RENAME:
          serviceImpl.rename((alluxio.grpc.RenamePRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.RenamePResponse>) responseObserver);
          break;
        case METHODID_SCHEDULE_ASYNC_PERSISTENCE:
          serviceImpl.scheduleAsyncPersistence((alluxio.grpc.ScheduleAsyncPersistencePRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.ScheduleAsyncPersistencePResponse>) responseObserver);
          break;
        case METHODID_SET_ACL:
          serviceImpl.setAcl((alluxio.grpc.SetAclPRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.SetAclPResponse>) responseObserver);
          break;
        case METHODID_SET_ATTRIBUTE:
          serviceImpl.setAttribute((alluxio.grpc.SetAttributePRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.SetAttributePResponse>) responseObserver);
          break;
        case METHODID_UNMOUNT:
          serviceImpl.unmount((alluxio.grpc.UnmountPRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.UnmountPResponse>) responseObserver);
          break;
        case METHODID_UPDATE_UFS_MODE:
          serviceImpl.updateUfsMode((alluxio.grpc.UpdateUfsModePRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.UpdateUfsModePResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FileSystemMasterClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FileSystemMasterClientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return alluxio.grpc.FileSystemMasterProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FileSystemMasterClientService");
    }
  }

  private static final class FileSystemMasterClientServiceFileDescriptorSupplier
      extends FileSystemMasterClientServiceBaseDescriptorSupplier {
    FileSystemMasterClientServiceFileDescriptorSupplier() {}
  }

  private static final class FileSystemMasterClientServiceMethodDescriptorSupplier
      extends FileSystemMasterClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FileSystemMasterClientServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FileSystemMasterClientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FileSystemMasterClientServiceFileDescriptorSupplier())
              .addMethod(getCheckConsistencyMethodHelper())
              .addMethod(getCompleteFileMethodHelper())
              .addMethod(getCreateDirectoryMethodHelper())
              .addMethod(getCreateFileMethodHelper())
              .addMethod(getFreeMethodHelper())
              .addMethod(getGetMountTableMethodHelper())
              .addMethod(getGetNewBlockIdForFileMethodHelper())
              .addMethod(getGetStatusMethodHelper())
              .addMethod(getListStatusMethodHelper())
              .addMethod(getMountMethodHelper())
              .addMethod(getRemoveMethodHelper())
              .addMethod(getRenameMethodHelper())
              .addMethod(getScheduleAsyncPersistenceMethodHelper())
              .addMethod(getSetAclMethodHelper())
              .addMethod(getSetAttributeMethodHelper())
              .addMethod(getUnmountMethodHelper())
              .addMethod(getUpdateUfsModeMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}