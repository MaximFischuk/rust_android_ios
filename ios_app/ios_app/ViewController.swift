//
//  ViewController.swift
//  ios_app
//
//  Created by Ivan Schuetz on 06.08.19.
//  Copyright © 2019 com.schuetz. All rights reserved.
//

import UIKit

var callbackLabelGlobal: UILabel?

class ViewController: UIViewController {

    @IBOutlet var greetingLabel: UILabel?
    @IBOutlet var additionLabel: UILabel?
    @IBOutlet var callbackLabel: UILabel?

    override func viewDidLoad() {
        super.viewDidLoad()
        
        let session = session_new()
        
        let string = session_greet(session!, "Ivan")!.takeRetainedValue()
        let s = string as NSString
        self.greetingLabel?.text = s as String
        
        let result = session_add(session!, 100)
        self.additionLabel?.text = "\(result)"
        
        callbackLabelGlobal = callbackLabel // C closure can't access context, so needs a global
        session_call(session!) { (a_number, a_boolean) in
            callbackLabelGlobal?.text = "Callback result: a_number: \(a_number), a_boolean: \(a_boolean)"
        }
    }
}
