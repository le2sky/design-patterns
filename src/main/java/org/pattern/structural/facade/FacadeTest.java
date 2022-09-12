package org.pattern.structural.facade;

import org.pattern.common.Testable;

public class FacadeTest implements Testable {
    @Override
    public void run() {
        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "test.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();;
        sftpClient.disConnect();
    }
}
